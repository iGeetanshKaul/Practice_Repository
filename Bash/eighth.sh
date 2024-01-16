#!/usr/bin/bash

command=htop

if command -v $command
then
	echo "If command is available then run it."
	$command
else
	echo "If it's not , then let's install it."
	sudo apt install -y $command
fi
$command
