<?php
header('Content-type: text/plain');
ini_set('memory_limit','128M');

//memory limit can cause errors if these are too big
define('SIZE_X',40);
define('SIZE_Y',40);
define('SIZE_Z',40);

//=============================================
require 'funcs.php';
require 'shapes.php';
//Init
$map = array();
for($ex = 0; $ex < SIZE_X; $ex++) {
	$map[$ex] = array();
	for($ey = 0; $ey < SIZE_Y; $ey++) {
		$map[$ex][$ey] = array();
		for($ez = 0; $ez < SIZE_Z; $ez++) {
			$map[$ex][$ey][$ez] = 0;
		}
	}
}

//=============================================

//Generate shapes

cylinder($map,array(20,0,20),array(20,40,20),15,16,array(1,2),array(3));

?>
dimensions=<?php print SIZE_X;?>,<?php print SIZE_Y;?>,<?php print SIZE_Z . "\n";?>
biomesToSpawnIn=desert,desert m,beach,deserthills
weight=30
embed_into_distance=1
acceptable_target_blocks=stone,grass,dirt,sand,gravel
allowable_overhang=2
max_cut_in=2
cut_in_buffer=1
max_leveling=2
leveling_buffer=1
preserve_water=0
preserve_lava=0
preserve_plants=0

rule1=0,100,sandstone
rule2=0,100,web
rule3=0,100,bookshelf

<?php 
 //output map

 for($ey = 0; $ey < SIZE_Y; $ey++) {
	echo "layer\n";
	for($ez = 0; $ez < SIZE_Z; $ez++) {
		for($ex = 0; $ex < SIZE_X; $ex++) {
			echo $map[$ex][$ey][$ez] . ($ex < SIZE_X-1 ? ',' : null);
		}
		echo "\n";
	}
	echo "endlayer\n";
 }



