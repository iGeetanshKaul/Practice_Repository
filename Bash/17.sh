#!/bin/bash

finished=0

while [ $finished -ne 1 ]
do
echo "What do you want?"
echo "1-Cowsay"
echo "2-sl"
echo "3-htop"
echo "4-Exit the script."

read input

case $input in 
	1) cowsay;;
	2) sl;;
	3) htop;;
	4) finished=1;;
	*) echo "type something"
esac
done

echo "Thank you for using this script."
