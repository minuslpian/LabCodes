#!/bin/bash
while [ 1 ]
do
	#PS3="Select option 1.SI 2.CI 3.Exit "
	select x in 1 2 3
	do
	case $x in
		1) read -p "Enter principal time rate " p t r
			interest=$((($p * $t * $r) /100))
			echo $interest;;
		2) read -p "Enter principal time rate no.of times int to cal per year " p t r n
			interest=$(($p * (1-($r/(100*$n))^($t * $n)) - $p))
			echo $interest;;
		3) break
	esac
	done
done

