#!/usr/bin/bash

package=htop

sudo apt install $package >> package_install_results.log

if [ $? -eq 0 ]
then
	echo "The Package is installed"
	echo "The new command is:"
	which $package
else
	echo "The package wasn't installed" >> package_install_failure.log
	
fi
