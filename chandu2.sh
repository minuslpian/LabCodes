#!/bin/bash

PS3="Enter from menu 1.create file 2.display contents 3.copy files 4.rename 5.delete 0.exit"
select i in 1 2 3 4 5 6
do
	case $i in
	1) 
		read -p "Enter filename " fname
		if [[ -e $fname ]]
		then
		echo" File already exists. Enter new name"
	else
		echo "Enter contents to add to file and press ctrl+d"
		cat > "$fname"
		echo " file created by name $fname"
		fi
	;;
	2)
		read -p "Enter filename " fname
		if [[ -e $fname ]]
		then
			cat $fname
		else
			echo "file doesn't exist";
		fi		
		;;
	3)
		read -p "Enter src filename " fname
		
		if [[ !-e $fname2 ]]
		then
			echo "file doesn't exist";
			
		else if [[ !-r $fname2 ]]
		then
			echo "file is not readable"
		else
		read -p "Enter filename to copy" fname2
		fi
		if [[ -e $fname2 ]]
		then
			echo "dest file already exists"
		else
			cp $fname $fname2
			echo "copying done"
		fi
		;;
	4)
		read -p "Enter filename and rename" fname3 fname4;
		if [[ -e $fname3 ]]
		then
			if [[ -e fname4 ]]
			then
				echo "renamed file already exists"
			else
				mv $fname3 $fname4
			fi
		else
			echo "file doesn't exist!!!";
		fi
		;;
	5)
		read -p "Enter filename to delete" fname5;
		if [[ -e $fname5 ]]
		then
			if [[ -w $fname5 ]]
			then
				rm $fname5
				echo "done deletion"
			else
				echo"file is not writable"
			fi
		else
			echo "file doesn't exist!!!"
		fi
		;;

	*)
		exit;;


esac
done


