#!/bin/bash

echo "What application would you like to download?"
echo "1. Htop."
echo "2. st."
echo "3. cowsay"
symbol="#"
read input

case $input in
	1) echo "Installing Htop!"
		sudo apt install htop;;
                for symbol in {1..100}
		do
			echo "{$symbol}"
		done

	2) echo "Installing st!"
		sudo apt install st;;

	3) echo "Installing cowsay!"
		sudo apt install cowsay;;
esac
