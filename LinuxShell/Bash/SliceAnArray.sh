#!/bin/bash
count=0
while read LINE
do
    arr[count]=$LINE
    let count=count+1
done
SLICE=("${arr[@]:3:5}")
echo ${SLICE[@]}
