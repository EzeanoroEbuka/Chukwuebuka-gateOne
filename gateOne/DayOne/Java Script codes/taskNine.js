let sum = 0;

for(let count = 0;count < 10;count++) {
	const prompt = require ("prompt-sync")();
	let score = parseInt(prompt("Enter Number: "))
	if(score > 0)	
		sum += score;
}
console.log(sum);