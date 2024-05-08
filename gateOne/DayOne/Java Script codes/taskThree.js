let sum = 0;
let average = 0;
let divisor = 10;

for(let count = 0;count < 10;count++) {
	const prompt = require ("prompt-sync")();
	let score = parseInt(prompt("Enter Number: "))	
	sum += score;
}

average = sum / divisor;

console.log(sum); 
console.log(average); 