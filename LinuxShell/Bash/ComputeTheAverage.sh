#!/bin/bash
read n
count=0
total=0
while [ $count -lt $n ]; do
    read num
    let total=total+num
    let count=count+1
done
r=`echo $total/$n | bc -l`
printf "%.3f\n" $r
