#!/bin/bash
read -p "Enter filename " fname;
PS3="Enter from menu 1.create file 2.display contents 3.copy files 4.rename 5.delete 0.exit"
select i in 1 2 3 4 5 6
do
	case $i in
	1) 
		if [[ -f $fname ]]
		then
		echo" File already exists. Enter new name";
	else
		var=`touch $fname`;
		echo " file created by name $fname";
		fi
	;;
	2)
		if [[ -f $fname ]]
		then
			var=`cat $fname`
			echo "$var";
		else
			echo "file doesn't exist";
		fi		
		;;
	3)
		read -p "Enter filename to copy" fname2;
		if [[ -f $fname2 ]]
		then
			`cp $fname $fname2`
		else
			echo "file doesn't exist. Creating new file..";
			`touch $fname2`
			`cp $fname $fname2`;
		fi
		echo "done ";
		break;;
	4)
		read -p "Enter filename and rename" fname3 fname4;
		if [[ -f $fname3 ]]
		then
			`mv $fname3 $fname4`
		else
			echo "file doesn't exist!!!";
		fi
		break;;
	5)
		read -p "Enter filename to delete" fname5;
		if [[ -f $fname5 ]]
		then
			`rm $fname5`;
		else
			echo "file doesn't exist!!!";
		fi
		break;;

	*)
		exit;;






esac
done


