<?php
header('Content-type: text/plain');
ini_set('memory_limit','128M');

//memory limit can cause errors if these are too big
define('SIZE_X',30);
define('SIZE_Y',50);
define('SIZE_Z',30);

define('OFFSET',100);

//=============================================
require 'funcs.php';
require 'shapes.php';
//Init
$map = str_repeat(chr(OFFSET),SIZE_X*SIZE_Y*SIZE_Z);


//=============================================

//Generate shapes
/*
	Numbers refer to the rules established later. 0 is empty/air.
*/


cylinder($map,array(3,0,3),array(15,30,15),2,3,array(1,2,4),array(3));
cylinder($map,array(27,0,3),array(15,30,15),2,3,array(1,2,4),array(3));
cylinder($map,array(27,0,27),array(15,30,15),2,3,array(1,2,4),array(3));
cylinder($map,array(3,0,27),array(15,30,15),2,3,array(1,2,4),array(3));

sphere($map,array(15,35,15),7,9,array(1),array(0));

decay($map,array(0,0,0),array(SIZE_X,SIZE_Y,SIZE_Z),15);



?>
dimensions=<?php print SIZE_Y;?>,<?php print SIZE_X;?>,<?php print SIZE_Z . "\n";?>
biomesToSpawnIn=desert,desert m,beach,deserthills,forest,foresthills,generic,savanna
weight=30
embed_into_distance=1
acceptable_target_blocks=stone,grass,dirt,sand,gravel
allowable_overhang=2
max_cut_in=20
cut_in_buffer=20
max_leveling=20
leveling_buffer=1
preserve_water=0
preserve_lava=0
preserve_plants=0

rule1=0,100,sandstone
rule2=0,100,sand
rule3=0,100,sandstone_stairs
rule4=0,50,preserveBlock

<?php 
 //output map

 for($ey = 0; $ey < SIZE_Y; $ey++) {
	echo "layer\n";
	for($ez = 0; $ez < SIZE_Z; $ez++) {
		for($ex = 0; $ex < SIZE_X; $ex++) {
			echo (ord($map[index($ex,$ey,$ez)])-OFFSET) . ($ex < SIZE_X-1 ? ',' : null);
		}
		echo "\n";
	}
	echo "endlayer\n";
 }



