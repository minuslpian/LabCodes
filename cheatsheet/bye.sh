#1/bin/bash

read -p "Enter the input :: " input
echo $input
echo $input | grep -iw "bye"

while [ $? -ne 0 ]
do
   read -p "Enter the input :: " input
   echo $input
	echo $input | grep -iw "bye"
done
