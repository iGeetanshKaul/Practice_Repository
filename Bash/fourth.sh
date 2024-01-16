#!/usr/bin/bash


num1="50"
num2=$(expr 40 \* 60)
num3=$(expr $num1 + $num2)
echo $num3
