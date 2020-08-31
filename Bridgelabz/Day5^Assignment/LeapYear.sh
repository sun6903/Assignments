#!/bin/bash -x
read -p "enter a year: " year;
if [[ $year -gt 999 && $year -lt 10000 && $year%4 -eq 0 && $year%100 -ne 0 || $year%400 -eq 0 ]]
then
	echo "$year is a leap year";
else
	echo "$year is not a leap year";
fi
