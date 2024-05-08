let sum = 0;
let average = 0;
let counter = 0;

for(let count = 0;count < 10;count++) {
	const prompt = require ("prompt-sync")();
	let score = parseInt(prompt("Enter Number: "))
	if(score > 0){	
		sum += score;
		counter++;}
}
average = sum / counter;

console.log(sum);
console.log(average); 
