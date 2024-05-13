const prompt = require('prompt-sync')();
let userDate = prompt("Enter Date of Birth");
	dateOfBirthToAge(userDate);
         

function dateOfBirthToAge(userInput) {

	const date = new Date();

	let output = 0;  
	let userYear = 0;
	let currentYear = 0;
	let currentMonth = 0;
	let userMonth = 0;

	if(userInput.length() != 10){console.log("Incomplete Date Inputed.Date Format = DD/MM/YYY");}
	
	else {
 
		userInput = userInput.replace("/","");
		
		if(userInput >){console.log("Incomplete Date Inputed.Date Format = DD/MM/YYY");}

		for(let count =userInput.length() - 4;count < userInput.length();count++) {  

	 		let convertedInput = (userInput.charAt(count)) - '0';
			userYear = (userYear * 10) + convertedInput;
		} 
	 	userMonth = (userInput.charAt(3)) - '0';

		currentYear = date.getYear();
		currentMonth = date.getMonthValue();

		output = currentYear - userYear;

		if(userMonth < currentMonth) {output = output - 1;}
		
						
		}
	return outPut;

}

 