<?php

/*
   Draws a cylinder
   $map - pass map by reference
   $start - start vector - array(0,3,5)
   $end - end vector - array(1,2,3)
   $rinner - inner radius
   $router - outer radius (> $rinner)
   $types - array of material types, for which is randomly selected - array('sandstone','air','stone_slab-1')
   $filler - [optional] array of material types, randomly selected - array('sandstone','air','stone_slab-1')
*/
function cylinder(&$map,$start,$end,$rinner,$router,$types,$filler=array()) {
	
	$empty_cylinder = !is_array($filler) || count($filler) == 0;
	//vector AB (start to end)
	$AB = sub($end,$start);
	$ABunit = unit($AB);
	
	for($ex = 0; $ex < SIZE_X; $ex++) {
		for($ey = 0; $ey < SIZE_Y; $ey++) {
			for($ez = 0; $ez < SIZE_Z; $ez++) {
				//Testing point (ex,ey,ez)
				
				//Vector AC (start to test point)
				$AC = array($ex-$start[0],$ey-$start[1],$ez-$start[2]);
				$ACunit = unit($AC);
				
				//Calculate distance along AB of AC cast onto it
				
				$ADMag = dot($AC,$ABunit);
				
				//echo "([{$ex},{$ey},{$ez}],".p($start).",".p($AC)."\n";
				//echo p($AC) . "|{$ADMag}\n";
				
				if ( $ADMag >= 0 && $ADMag <= magnitude($AB) ) { //Is it within the cylinder start/end caps?
				
					//Calculate vector from A to nearest point on AB to test point
					
					$AD = mult($ABunit,$ADMag);
					
					//Calculate distance from line
					$DC = sub($AC,$AD); //Vector from AB_AC to test point
					//echo p($AC) . p($ACunit) . ($ADMag) . "\n";
					$r = magnitude($DC);
					
					//If within range of cylinder wall
					if ( $r >= $rinner && $r <= $router ) {

						$map[index($ex,$ey,$ez)] = chr(OFFSET+rpick($types));
						
					} else if ( $r < $rinner ) { //Inside cylinder
					
						if ( !$empty_cylinder ) {
							$map[index($ex,$ey,$ez)] = chr(OFFSET+rpick($filler));
						}
						
					} else {
						//Outside
					}
				}
			}
		}
	}
}

function sphere(&$map,$center,$rinner,$router,$types,$filler=array()) {
	$is_empty = !is_array($filler) || count($filler) == 0;
	
	for($ex = 0; $ex < SIZE_X; $ex++) {
		for($ey = 0; $ey < SIZE_Y; $ey++) {
			for($ez = 0; $ez < SIZE_Z; $ez++) {
				//Testing point (ex,ey,ez)
				$p = array($ex,$ey,$ez);
				$dist = distance3D($p,$center);
				
				//If within range of cylinder wall
				if ( $dist >= $rinner && $dist <= $router ) {

					$map[index($ex,$ey,$ez)] = chr(OFFSET+rpick($types));
					
				} else if ( $dist < $rinner ) { //Inside cylinder
				
					if ( !$empty_cylinder ) {
						$map[index($ex,$ey,$ez)] = chr(OFFSET+rpick($filler));
					}
					
				}	
					
			}
		}
	}
}


function decay(&$map,$corner1,$corner2,$chance=10) {
	$xmin = $corner1[0] > $corner2[0] ? $corner2[0] : $corner1[0];
	$ymin = $corner1[1] > $corner2[1] ? $corner2[1] : $corner1[1];
	$zmin = $corner1[2] > $corner2[2] ? $corner2[2] : $corner1[2];

	$xmax = $corner1[0] > $corner2[0] ? $corner1[0] : $corner2[0];
	$ymax = $corner1[1] > $corner2[1] ? $corner1[1] : $corner2[1];
	$zmax = $corner1[2] > $corner2[2] ? $corner1[2] : $corner2[2];

	for($ex = $xmin; $ex < $xmax; $ex++) {
		for($ey = $ymin; $ey < $ymax; $ey++) {
			for($ez = $zmin; $ez < $zmax; $ez++) {
				if ( $ex >= 0 && $ex < SIZE_X && $ey >= 0 && $ey < SIZE_Y && $ez >= 0 && $ez < SIZE_Z ) {
					if ( rand(0,1000) < $chance*10 ) {
						$map[index($ex,$ey,$ez)] = chr(OFFSET);
					}
				}
			}
		}
	}

}


