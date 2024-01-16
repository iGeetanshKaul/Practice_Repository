#!/bin/bash

num=50
name="Geetansh"

#!/bin/bash

num=50
name="Geetansh"

checkAge( ) {
	if [ $num -lt 50 ] || [ $num -eq 50 ]
	then
		echo "Old!"
	else
		echo "Not old."
	fi
}

checkName( ) {
	if [ $name == "Geetansh" ]
	then
		echo "Yes it's him."
	else
		echo "It's not him."
	fi
}

checkAge
checkName
