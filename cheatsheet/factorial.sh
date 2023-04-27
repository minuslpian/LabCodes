#!/bin/bash
read -p "Enter number to get factorial from " num
fac=1
for (( i=1;i<=num;i++ ))
do
	fac=$((fac*i))
	
done
echo "factorial of $num is $fac"
