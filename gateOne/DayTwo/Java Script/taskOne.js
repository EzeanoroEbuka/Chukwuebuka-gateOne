let arrOfScores = [10];

for(let count = 0;count < 10;count++) {
	const prompt = require ("prompt-sync")();
	let score = parseInt(prompt("Enter Number: "));
	arrOfScores[count] = score;
}
