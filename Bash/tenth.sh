#!/usr/bin/bash

directory=/donotexist

if [ -d $directory ]
then
	echo "Yes the directory does exists."
	exit 0
else
	echo "NO the directory doesn't exists."
	echo 1
	exit 1
fi


