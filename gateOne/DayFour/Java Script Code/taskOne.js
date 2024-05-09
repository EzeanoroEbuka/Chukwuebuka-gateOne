	
	let scoreInput = [3][3];

	let positionTwo = 0;
	let newPosition = 0;

	for(let counter = 0;counter < 3;counter++) {

		for(let count = 0;count < 3;count++) {
			const prompt = require("prompt-sync")();
			console.log(`
			Select Character Position
			1	2	3
			11	12	13
			21	22	23
				`);
			let position = parseInt(prompt());
			
			if(position == 1||position == 2||position == 3||position == 11||position == 12||position == 13||position == 21||position == 22||position == 23){
				positionTwo = position % 10;
				
				newPosition = Math.floor(position,10)}
			
			else{
				console.log("Invalid!! Pls Select from the list of Numbers Given");counter--;continue;}

			
			console.log("Enter Character");
			let characterInput = prompt();

			if(characterInput == 'X' || characterInput == 'O'){
				scoreInput[newPosition][positionTwo -1] = characterInput;}
			else{
				console.log("Invalid!! Pls Enter 'X' or 'O'\n");count--;continue;}

			console.log();
			console.log("_______________________");
			for(let counterTwo = 0;counterTwo < 3;counterTwo++) {
		
				for(let countTwo = 0;countTwo < 3;countTwo++) {
					console.log(` ${scoreInput[counterTwo][countTwo]}`);
		
				}
				console.log();
				console.log("_______________________");
				
			}
		}			
	}

	console.log();
	console.log("_______________________");
	for(let counter = 0;counter < 3;counter++) {
		
		for(let count = 0;count < 3;count++) {
			console.log(`  ${scoreInput[counter][count]}\t`);
		
		}
		console.log();
		console.log("_______________________");

	}




