#!/bin/bash

read -p "Enter a number:" num
fac=$num
while [ $num -ne 0 ]
do
	fac=$($fac*$($num-1) | bc)
	num=$($num-1 | bc)
done
