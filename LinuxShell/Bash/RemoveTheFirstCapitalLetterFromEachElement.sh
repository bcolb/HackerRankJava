#!/bin/bash
count=0
while read LINE
do
    arr[count]=$LINE
    let count=count+1
done
match=[A-Z]
replace=.
echo ${arr[@]/$match/$replace}
