let nameList = []; 
let lastNameList = []; 
let numberList = [];
	console.log(afeezMenu())	

function afeezMenu() {
		 	
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
 
		`);
	const prompt = require("prompt-sync")();
	let navigate = parseInt(prompt(""));
	switch(navigate) {
	case 1 : addContacts();
	case 2 : removeContact();
	case 3 : findByNumber();
	case 4 : findByFirstName();
	case 5 : findByLastName();
	case 6 : editContact();
	case 0 : afeezMenu();
	default : afeezMenu();

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

	
	numberList = contactNumber;
	nameList = contactName;
	lastNameList = contactLastName;

	console.log("Contact created successfully");
	anotherContacts();
	 
}

function anotherContacts() {
	
	const prompt = require("prompt-sync")();
	let addContactAgain = prompt("Add Another Contact? (Yes/No): ");
	
	if(addContactAgain.localeCompare("yes")){
	afeezMenu();}

	if(addContactAgain.localeCompare("no")){
		console.log("Contact Added Successfully");
		addContacts();}
	else {
		console.log("Invalid response");
		anotherContacts();
		
	    } 
}
/**
public static void removeContact() {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Contact Number To Be Removed"); 
	String removeContact = input.nextLine();
	String delete = "";

	for(int count = 0;count < numberList.size();count++) {
		delete = numberList.get(count);

		if(delete.equals(removeContact)){
			numberList.remove(count);
			nameList.remove(count);
			lastNameList.remove(count);
			System.out.println("Contact removed Successfully");
			afeezMenu();
		}
	}
		if(!(delete.equals(removeContact))){
			System.out.println("Number not Found");
			afeezMenu();}
}
public static void findByNumber() {

	System.out.println("Enter Phone Number");
	String numberIncontact = input.nextLine();

	String number = "";
	String name = "";
	String otherName = "";

	for(int count = 0;count < numberList.size();count++) {
		number = numberList.get(count);
		name = nameList.get(count);
		otherName = lastNameList.get(count);

		if(number.equals(numberIncontact)){
			System.out.printf("%s  %s  %n%s%n",name,otherName,number);
			afeezMenu();
		}
	}
	if(!(number.equals(numberIncontact))){
		System.out.println("Contact Not Found");afeezMenu();}
	
	System.out.println();
}
public static void findByFirstName() {

	System.out.println("Enter First Name Of Contact");
	String firstNameIncontact = input.nextLine();

	String number = "";
	String name = "";
	String otherName = "";

	for(int count = 0;count < nameList.size();count++) {
		number = numberList.get(count);
		name = nameList.get(count);
		otherName = lastNameList.get(count);

		if(name.equalsIgnoreCase(firstNameIncontact)){
			System.out.printf("%s  %s  %n%s%n",name,otherName,number);afeezMenu();
		}
	}
	if(!(name.equals(firstNameIncontact))){
		System.out.println("Contact Not Found");afeezMenu();}

	System.out.println();
}
public static void findByLastName() {

	System.out.println("Enter Last Name Of Contact");
	String lastNameIncontact = input.nextLine();

	String number = "";
	String name = "";
	String otherName = "";

	for(int count = 0;count < lastNameList.size();count++) {
		number = numberList.get(count);
		name = nameList.get(count);
		otherName = lastNameList.get(count);

		if(otherName.equalsIgnoreCase(lastNameIncontact)){
			System.out.printf("%s  %s  %n%s%n",name,otherName,number);
			afeezMenu();
		}
	}
	if(!(otherName.equals(lastNameIncontact))){
		System.out.println("Contact Not Found");afeezMenu();}
	
	System.out.println();
}
public static void editContact() {

	System.out.println("""
			******************
			** ALL CONTACTS **
			******************
	================================================================================
	""");
	
	System.out.println("NAMES\t\t\t\t\tNUMBERS");
	System.out.println("================================================================================");
	for(int count = 0;count < numberList.size();count++) {
				
		System.out.printf("%s\t%s\t\t\t|\t%s%n",nameList.get(count),lastNameList.get(count),numberList.get(count));
	}
	System.out.println("================================================================================");
	System.out.println();
	afeezMenu();
}


**/



