def cardValidatof ():

	output = false
	output_one = false
	output_two = false
	output_three = false
	output_four = false  

	if len(input) == 19:
		output_one = true

	for index in input:
 		if index{0} == '4'or index{0} == '5' or index{0} == '6':
 			output_two = true
		if index{4:19:4} == '-' and index{4:19:4} == '-' and index{4:19:4} == '-':
			output_three = true
	
		if output_one == true and output_two == true and output_three == true: 
			output = true
	else:
		output = false

	return output


