#!/bin/bash
read input
R=`echo $input | bc -l`
printf "%.3f\n" $R
