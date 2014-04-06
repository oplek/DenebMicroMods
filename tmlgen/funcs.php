<?php

/* Helper functions */

function distance3D(&$a,&$b) {
	$dx = $b[0] - $a[0];
	$dy = $b[1] - $a[1];
	$dz = $b[2] - $a[2];
	
	return sqrt($dx*$dx+$dy*$dy+$dz*$dz);
}

function distance2D($x1,$y1,$x2,$y2) {
	$dx = $x2-$x1;
	$dy = $y2-$y1;

	return sqrt($dx*$dx+$dy*$dy);
}

//Linear interpolation (ratio $t)
function interp($x1,$y1,$x2,$y2,$t) {
	$dx = $x2 - $x1;
	$dy = $y2 - $y1;
	$angle = atan2($dy,$dx);
	$dist = sqrt($dx*$dx + $dy*$dy);
	return array($x1 + $t*$dist*cos($angle),$y1 + $t*$dist*sin($angle));	
}

//Dot product
function dot(&$a,&$b) {
	return ($a[0]*$b[0]) + ($a[1]*$b[1]) + ($a[2]*$b[2]);	
}

//Cross product
function cross(&$a,&$b) {
    return array(
		($a[1] * $b[2]) - ($a[2] * $b[1]),
		($a[0] * $b[2]) - ($a[2] * $b[0]),
		($a[0] * $b[1]) - ($a[1] * $b[0])
	);
}

//Magnitude of vector
function magnitude(&$a) {
	return sqrt($a[0]*$a[0] + $a[1]*$a[1] + $a[2]*$a[2]);
}

//Multiply vector by $dist
function mult(&$a,$dist) {
	return array($dist * $a[0],$dist * $a[1],$dist * $a[2]);
}

//Convert vector into normal vector
function unit(&$a) {
	$magnitude = magnitude($a);
	if ( $magnitude != 0 ) {
		return array($a[0]/$magnitude,$a[1]/$magnitude,$a[2]/$magnitude);
	} else {
		return array(0,0,0);
	}
}

//Subtract two vectors
function sub(&$a,&$b) {
	return array($a[0]-$b[0],$a[1]-$b[1],$a[2]-$b[2]);
}

//Add two vectors
function add(&$a,&$b) {
	return array($a[0]+$b[0],$a[1]+$b[1],$a[2]+$b[2]);
}

function p(&$a) {
	return '[' . implode(',',$a) . ']';
}

//Picks random entry from array
function rpick(&$a) {
	return $a[rand(0,count($a)-1)];
}

function index($x,$y,$z) {
	return ($x + SIZE_X*$y) + (SIZE_X*SIZE_Y*$z);

}
