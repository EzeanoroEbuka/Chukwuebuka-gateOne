const {dateOfBirthToAge} = require("./function.js");
 
test("dateOfBirth", () => {

	let  input = 20/104/2007;
	let result = dateOfBirthToAge(input);
	expect(result).toBe(17);});