#!/usr/bin/bash

command=/usr/bin/htop

if [ -f $command ]
then 
	echo "$command is available."
else
	echo "$command is not available."
	echo "Installing it...."
	sudo apt install -y htop
fi
$command
