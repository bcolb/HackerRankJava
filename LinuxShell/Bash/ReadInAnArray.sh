#!/bin/bash
count=0
while read LINE
do
    arr[count]=$LINE
    let count=count+1
done
# echo the entire array
echo ${arr[@]}