#!/bin/bash
echo "Welcome to Employee wage computation program on master branch"
IS_PART_TIME=1;
IS_FULL_TIME=2;
MAX_HRS_IN_MONTH=100;
EMP_RATE_PER_HR=20;
NUM_WORKING_DAYS=20;
totalEmpHrs=0;
totalWorkingDays=0;
declare -A dailyWage;
function getWorkHrs(){
local empCheck=$1
case $empCheck in
  $IS_FULL_TIME)
      empHrs=8
         ;;
  $IS_PART_TIME)
       empHrs=8
   ;;
  *)
    empHrs=0

        ;;
esac
echo $empHrs
}
while [[ $totalEmpHrs -lt $MAX_HRS_IN_MONTH && $totalWorkingDays -lt $NUM_WORKING_DAYS ]]
do
((totalWorkingDays++))
empCheck=$(($RANDOM%3));
empHrs=$( getWorkHrs $empCheck )
totalEmpHrs=$(( $totalEmpHrs + $empHrs ));
dailyWage["Day "$totalWorkingDays]=$(( $empHrs*$EMP_RATE_PER_HR ))
done

totalSalary=$(($totalEmpHrs*$EMP_RATE_PER_HR))
echo ${dailyWage[@]}
echo ${!dailyWage[@]}
