let nameList = []; 
let lastNameList = []; 
let numberList = [];
	console.log(printAfeezMenu())
	
function printAfeezMenu() {
		 	
	console.log(`

	:::::::::::::::::::::::
	::  AFEEZ CONTACTS   ::
	:::::::::::::::::::::::
	
	Welcome Afeez.....
	Select from option (1 - 6)

	1. Add Contact
	2. Remove Contact
	3. Find Contact by Phone Number
	4. Find Contact by first Name
	5. Find Contact by Last Name
	6. Edit Contact
	7. View All
 
		`);
	const prompt = require("prompt-sync")();
	let navigate = parseInt(prompt(""));
	switch(navigate) {
	case 1 : addContacts();
	case 2 : removeContact();
	case 3 : findContactByNumber();
	case 4 : findContactByFirstName();
	case 5 : findContactByLastName();
	case 6 : editContact();
	case 7 : PrintOutContacts();
	case 0 : printAfeezMenu();
	default : printAfeezMenu();

	}
		
}

function addContacts() {

	console.log(`

	:::::::::::::::::::::
	::  ADD CONTACTS   ::
	:::::::::::::::::::::
			`);
	
	const prompt = require("prompt-sync")();
	let contactName = prompt("Enter New Contact First Name: ");

	let contactLastName = prompt("Enter New Contact Last Name: ");
	
	let contactNumber = prompt("Enter New Contact Telephone: ");

	
	numberList.push(contactNumber);
	nameList.push(contactName);
	lastNameList.push(contactLastName);

	console.log("Contact created successfully");
	addAnotherContacts();
	 
}

function addAnotherContacts() {
	
	const prompt = require("prompt-sync")();
	let addContactAgain = prompt("Add Another Contact? (Yes/No): ");
	
	if(addContactAgain.toUpperCase() === ("YES")){
		addContacts();}

	if(addContactAgain.toUpperCase() === ("NO")){
		console.log("Contact Added Successfully");
		printAfeezMenu();}
	else {
		console.log("Invalid response");
		addAnotherContacts();
		
	    } 
}

function removeContact() {
	
	const prompt = require("prompt-sync")();
	let contactNumberToBeRemoved = prompt("Enter Contact Number To Be Removed: ");
	
	
	let tempotalNumberHolder = "";

	for(let count = 0;count < numberList.length;count++) {
		tempotalNumberHolder = numberList[count];
		
		if(tempotalNumberHolder === (contactNumberToBeRemoved)){
			numberList.splice(count,1);
			nameList.splice(count,1);
			lastNameList.splice(count,1);
			console.log("Contact removed Successfully");
			printAfeezMenu();
		}
	}
	if(!(tempotalNumberHolder=== (contactNumberToBeRemoved))){
			console.log("Number not Found");
			printAfeezMenu();}
}

function findContactByNumber() {

	const prompt = require("prompt-sync")();
	let numberIncontact = prompt("Enter Contact Number You Wish To Find ");
	
	let temporalNumberHolder = "";
	let temporalNameHolder = "";
	let temporalLastNameHolder = "";

	for(let count = 0;count < numberList.length;count++) {
		temporalNumberHolder = numberList[count];
		temporalNameHolder = nameList[count];
		temporalLastNameHolder = lastNameList[count];

		if(temporalNumberHolder.toUpperCase() === numberIncontact.toUpperCase()){
			console.log(`${temporalNameHolder}  ${temporalLastNameHolder}\n${temporalNumberHolder}\n`);
			printAfeezMenu();
		}
	}
	if(!(temporalNumberHolder.toUpperCase() === numberIncontact.toUpperCase())){
		console.log("Contact Not Found");printAfeezMenu();}
	console.log();
}
function findContactByFirstName() {

	const prompt = require("prompt-sync")();
	let firstNameIncontact = prompt("Enter Contact First Name You Wish To Find ");
	
	let temporalNumberHolder = "";
	let temporalNameHolder = "";
	let temporalLastNameHolder = "";

	for(let count = 0;count < numberList.length;count++) {
		temporalNumberHolder = numberList[count];
		temporalNameHolder = nameList[count];
		temporalLastNameHolder = lastNameList[count];

		if(temporalNameHolder.toUpperCase() === firstNameIncontact.toUpperCase()){
			console.log(`${temporalNameHolder}  ${temporalLastNameHolder}\n${temporalNumberHolder}\n`);
			printAfeezMenu();
		}
	}
	if(!(temporalNameHolder.toUpperCase() === firstNameIncontact.toUpperCase())){
		console.log("Contact First Name Not Found");printAfeezMenu();}
	console.log();
}
function findContactByLastName() {

	
	const prompt = require("prompt-sync")();
	let lastNameIncontact = prompt("Enter Contact Last Name You Wish To Find ");
	
	let temporalNumberHolder = "";
	let temporalNameHolder = "";
	let temporalLastNameHolder = "";

	for(let count = 0;count < numberList.length;count++) {
		temporalNumberHolder = numberList[count];
		temporalNameHolder = nameList[count];
		temporalLastNameHolder = lastNameList[count];

		if(temporalLastNameHolder.toUpperCase() === lastNameIncontact.toUpperCase()){
			console.log(`${temporalNameHolder}  ${temporalLastNameHolder}\n${temporalNumberHolder}\n`);
			printAfeezMenu();
		}
	}
	if(!(temporalLastNameHolder.toUpperCase() === lastNameIncontact.toUpperCase())){
		console.log("Contact Last Name Not Found");printAfeezMenu();}
	console.log();
}

function editContact() {

	const prompt = require("prompt-sync")();
	let contactToBeEdited = prompt("Enter Contact Detail To Be Edit: ");
	
	
	let temporalNumberHolder = "";
	let temporalNameHolder = "";
	let temporalLastNameHolder = "";
	
	for(let count = 0;count < numberList.length;count++) {
		tempotalNumberHolder = numberList[count];
		temporalNameHolder = nameList[count];
		temporalLastNameHolder = lastNameList[count];
		
		if(temporalNumberHolder === contactToBeEdited) {
			console.log(tempotalNumberHolder + "\ncontact Found");
			let newContactDetail = prompt("Enter Contact New Number To Be Edit: ");
			numberList.splice(count,1,newContactDetail);
			console.log("Contact Number Editd Successfully");
			printAfeezMenu();
		}
		if(temporalNameHolder.toUpperCase() === contactToBeEdited.toUpperCase()) {
			console.log(temporalNameHolder + "\ncontact Found");
			let newContactDetail = prompt("Enter Contact New First Name To Be Edit: ");
			nameList.splice(count,1,newContactDetail);
			console.log("Contact First Name Edited Successfully");
			printAfeezMenu();
		}
		if(temporalLastNameHolder.toUpperCase() === contactToBeEdited.toUpperCase()) {
			console.log(temporalLastNameHolder + "\ncontact Found");
			let newContactDetail = prompt("Enter Contact New First Name To Be Edit: ");
			lastNameList.splice(count,1,newContactDetail);
			console.log("Contact Last Name Edited Successfully");
			printAfeezMenu();
		}
	}
	
	if(!(tempotalNumberHolder.toUpperCase() === contactToBeEdited.toUpperCase())) {
		console.log("Contact Detail not Found");printAfeezMenu();}
			
	if(!(temporalNameHolder.toUpperCase() === ccontactToBeEdited.toUpperCase())) {
		console.log("Contact Detail Not Found");printAfeezMenu();}
	
	if(!(temporealLastNameHolder.toUpperCase() === contactToBeEdited.toUpperCase())) {
		console.log("Contact Detail Not Found");printAfeezMenu();}
}

function PrintOutContacts() {

	console.log(`
			******************
			** ALL CONTACTS **
			******************
	================================================================================
	`);
	
	console.log("NAMES\t\t\t\t\t\t\tNUMBERS");
	console.log("================================================================================");
	for(let count = 0;count < numberList.length;count++) {
				
		console.log(`${nameList[count]}\t${lastNameList[count]}\t\t\t\t|\t\t\t${numberList[count]}\n`);
	}
	console.log("================================================================================");
	console.log();
	printAfeezMenu();
}






