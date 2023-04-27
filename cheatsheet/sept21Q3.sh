#!/bin/bash
read -p "Enter path " path

if [[ `ls -ld $path | cut -c1` == d ]]
then
	echo "$path Directory `stat -c "%a" $path` "
else
	echo "$path File `stat -c "%a" $path` "
fi


