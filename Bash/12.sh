#!/usr/bin/bash

file=~/text.txt

while [ -f $file ]
do 
	echo "As of $(date), the file exists." >> existing_file.log
	sleep 3
done

echo "As of $(date), the file doesn't extsts." >> deletion_file.log
