#!/bin/bash
read -p "Enter folder name " folder
for (( i=1;i<=5;i++ ))
do
	mkdir "$folder$i"
	touch ./$folder$i/file$i
	echo "I'm file $i" > ./$folder$i/file$i
done

