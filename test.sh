#!/bin/bash

PS3="choose day of the week to see if it's working day or not:"
select day in SUN MON TUES WED THU FRI SAT;
do
if [ $day = 'SUN' ]
	then
		echo "$day is not working day"
else
		echo "$day is working day"
fi
break
done
