const prompt = require("prompt-sync")();
let cardNumber = prompt("Hellow, Kindly Enter Card Number to Verify: ");
	
let firstNumber = cardNumber[0];
let secondNumber = cardNumber[1];
let numberLength = cardNumber.length;
let cardStatus = "";
if(cardNumber.length < 13 || cardNumber.length > 16) 
	cardStatus = ("Invalid Number");
else{
if(firstNumber === ('4'))
	cardStatus = ("Visa Cards");
	
else{
if(firstNumber === ('5'))
	cardStatus = ("Master Card");
	
else{
if(firstNumber === ('6'))
	cardStatus = ("Discover Cards");
	
else{
if(firstNumber === ('3') && secondNumber === ('7'))
	cardStatus = ("American Express Cards");
		
else{
	cardStatus = ("Invalid Number");
	 }
	}
     }
  }
}
	
	let total = 0;
	let totalTwo = 0;
	let cardValidity = "";
	
	for(let count = numberLength - 2;count >= 0;count = count - 2) {
		
		let convertedValue = (cardNumber[count]) - '0';
		if(convertedValue < 0 || convertedValue > 9){
		console.log("Invalid");break;}

		
		let add = convertedValue * 2;
		if(add > 9){
			add = (add / 10) + (add % 10);}
		total += add;
		
	}
	
	for(let count = numberLength - 1;count > 0;count = count - 2) {
		let convertedValue = (cardNumber[count]) - '0';
		
		if(convertedValue < 0 || convertedValue > 9){
		 console.log("Invalid");break;}

		totalTwo += convertedValue;
	}
	if((total + totalTwo) % 10 == 0)
		cardValidity = ("Valid");
	else
		cardValidity =("Invalid");
	
	console.log("\n")
	console.log("****************************************");

	console.log("**Credit Card Type: " + cardStatus);

	console.log("**Credit Card Number: " + cardNumber);

	console.log("**Credit Card Digit: " + numberLength);

	console.log("**Credit Card Validity Status: " + cardValidity);

	console.log("****************************************");
	
