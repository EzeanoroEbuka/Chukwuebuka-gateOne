public static Boolean cardValidator(String input) {

	Boolean output = false; 
	Boolean outputOne = false;
	Boolean outputTwo = false;
	Boolean outputThree = false;
	  
	
	for(int count = 0;count < 19;count++){
		if(input.length() == 19)
			outputOne = true;
		
 		if(input.charAt(0) == '4'|| input.charAt(0) == '5'|| input.charAt(0) == '6')
 			outputTwo = true;

		if(input.charAt(4) == '-' && input.charAt(9) == '-' && input.charAt(14) == '-')
			outputThree = true;
	}
	if(outputOne == true && outputTwo == true && outputThree == true) {
		output = true;}
	else {
		output = false;}

	return output;

}



}
