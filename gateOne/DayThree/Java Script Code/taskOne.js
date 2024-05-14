let correct_answer = 0;
let wrong_answer = 0;

for(let count = 0;count < 10;count++) {
	let randomNumbers = Math.floor(Math.random() * 50);
	let secondRandomNumber = Math.floor(Math.random()*(100 - 50) + 50 );

	console.log(`${randomNumbers}  X  ${secondRandomNumber}\t=`);
	const prompt = require("prompt-sync")();
	let userInput = parseInt(prompt());

	let result = randomNumbers * secondRandomNumber;

	if(userInput == result)	{
		correct_answer = correct_answer + 1
		console.log()
		console.log(`The Answer: ${result} is Correct`)
	}

	else{
		wrong_answer = wrong_answer + 1	
		console.log()
		console.log(`The Answer: ${userInput} is Wrong`)
		console.log(`The Correct Answer is: ${result}`)
		console.log()
	 }

   }
	console.log(`Total Correct Answer is: ${correct_answer}\nTotal Wrong Answer is: ${wrong_answer}`)