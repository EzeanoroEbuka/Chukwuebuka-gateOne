import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBook {

 private  static Scanner input = new Scanner(System.in);
 private static Scanner scanner = new Scanner(System.in);
 static ArrayList<String> nameList = new ArrayList<>(); 
 static ArrayList<String> lastNameList = new ArrayList<>(); 
 static ArrayList<String> numberList = new ArrayList<>();

public static void main(String... args) {

		printAfeezMenu();
}
public static void printAfeezMenu() {
		 	
	System.out.println("""
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
	7. View  All Contacts
	0. Back
			""");
	int navigate = scanner.nextInt();
	switch(navigate) {
	case 1 -> addContacts();
	case 2 -> removeContact();
	case 3 -> findContactByNumber();
	case 4 -> findContactByFirstName();
	case 5 -> findContactByLastName();
	case 6 -> contactEditor();
	case 7 -> printAllContact();
	case 0 -> printAfeezMenu();
	default -> printAfeezMenu();

	}
		
}

public static void addContacts() {

	System.out.println("""
	:::::::::::::::::::::
	::  ADD CONTACTS   ::
	:::::::::::::::::::::
			""");
	
	System.out.println("Enter New Contact First Name");
	String contactFirstName = input.next();

	System.out.println("Enter New Contact Last Name");
	String contactLastName = input.next();
	
	System.out.println("Enter New Contact Telephone");
	String contactNumber = input.next();

	
	numberList.add(contactNumber);
	nameList.add(contactFirstName);
	lastNameList.add(contactLastName);

	System.out.println("Contact created successfully");
	addAnotherContacts();
	
	    
}
public static void addAnotherContacts() {
	

	System.out.println("Add Another Contact? (Yes/No)");
	String addContactAgain = input.next();
	if(addContactAgain.equalsIgnoreCase("Yes")){
		addContacts();}

	if(addContactAgain.equalsIgnoreCase("No")){
		System.out.println("""
			Contact Added Successfully
			""");
		printAfeezMenu();}
	else {
		System.out.println("Invalid response");
		addAnotherContacts();} 
}
public static void removeContact() {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Contact Number To Be Removed"); 
	String contactToBeRemoved = input.nextLine();
	String tempotalNumberHolder = "";

	for(int count = 0;count < numberList.size();count++) {
		tempotalNumberHolder = numberList.get(count);

		if(tempotalNumberHolder.equals(contactToBeRemoved)){
			numberList.remove(count);
			nameList.remove(count);
			lastNameList.remove(count);
			System.out.println("Contact removed Successfully");
			printAfeezMenu();
		}
	}
	if(!(tempotalNumberHolder.equals(contactToBeRemoved))){
		System.out.println("Number not Found");
		printAfeezMenu();}
}
public static void findContactByNumber() {

	System.out.println("Enter Phone Number");
	String numberIncontact = input.nextLine();

	String tempotalNumberHolder = "";
	String tempotalNameHolder = "";
	String tempotalLastNameHolder = "";

	for(int count = 0;count < numberList.size();count++) {
		tempotalNumberHolder = numberList.get(count);
		tempotalNameHolder = nameList.get(count);
		tempotalLastNameHolder = lastNameList.get(count);

		if(tempotalNumberHolder.equals(numberIncontact)){
			System.out.printf("%s  %s  %n%s%n",tempotalNameHolder,tempotalLastNameHolder,tempotalNumberHolder);
			printAfeezMenu();
		}
	}
	if(!(tempotalNumberHolder.equals(numberIncontact))){
		System.out.println("Contact Not Found");printAfeezMenu();}
	
	System.out.println();
}
public static void findContactByFirstName() {

	System.out.println("Enter First Name Of Contact");
	String firstNameIncontact = input.nextLine();

	String tempotalNumberHolder = "";
	String tempotalNameHolder = "";
	String tempotalLastNameHolder = "";

	for(int count = 0;count < nameList.size();count++) {
		tempotalNumberHolder = numberList.get(count);
		tempotalNameHolder = nameList.get(count);
		tempotalLastNameHolder = lastNameList.get(count);

		if(tempotalNameHolder.equalsIgnoreCase(firstNameIncontact)){
			System.out.printf("%s  %s  %n%s%n",tempotalNameHolder,tempotalLastNameHolder,tempotalNumberHolder);printAfeezMenu();
		}
	}
	if(!(tempotalNameHolder.equals(firstNameIncontact))){
		System.out.println("Contact Not Found");printAfeezMenu();}

	System.out.println();
}
public static void findContactByLastName() {

	System.out.println("Enter Last Name Of Contact");
	String lastNameIncontact = input.nextLine();

	String tempotalNumberHolder = "";
	String tempotalNameHolder = "";
	String tempotalLastNameHolder = "";

	for(int count = 0;count < lastNameList.size();count++) {
		tempotalNumberHolder = numberList.get(count);
		tempotalNameHolder = nameList.get(count);
		tempotalLastNameHolder = lastNameList.get(count);

		if(tempotalLastNameHolder.equalsIgnoreCase(lastNameIncontact)){
			System.out.printf("%s  %s  %n%s%n",tempotalNameHolder,tempotalLastNameHolder,tempotalNumberHolder);
			printAfeezMenu();
		}
	}
	if(!(tempotalLastNameHolder.equals(lastNameIncontact))){
		System.out.println("Contact Not Found");printAfeezMenu();}
	
	System.out.println();
}
public static void contactEditor() {

	System.out.println("Serch for contact to be Edited");
	
	System.out.println("Enter Contact Detail To Be Edited"); 
	String contactToBeEdited = input.nextLine();
	

	String tempotalNumberHolder = "";
	String tempotalNameHolder = "";
	String tempotalLastNameHolder = "";


	for(int count = 0;count < numberList.size();count++) {
		tempotalNumberHolder = numberList.get(count);
		tempotalNameHolder = nameList.get(count);
		tempotalLastNameHolder = lastNameList.get(count);

		if(tempotalNumberHolder.equalsIgnoreCase(contactToBeEdited)){
			System.out.println("Contact  Found");
			System.out.println("Enter New Contact Number"); 
			String newContact = input.nextLine();
			numberList.set(count,newContact);
			System.out.println("Contact Edited Successfully");
			printAfeezMenu();}

		if(tempotalNameHolder.equalsIgnoreCase(contactToBeEdited)){
			System.out.println("Contact  Found");
			System.out.println("Enter New Contact Name"); 
			String newContact = input.nextLine();
			nameList.set(count,newContact);
			System.out.println("Contact Edited Successfully");
			printAfeezMenu();}

		if(tempotalLastNameHolder.equalsIgnoreCase(contactToBeEdited)){
			System.out.println("Contact Last Name Found");
			System.out.println("Enter New Contact Last Name"); 
			String newContact = input.nextLine();
			lastNameList.set(count,newContact);
			System.out.println("Contact Edited Successfully");
			printAfeezMenu();}

	}
	if(!(tempotalNumberHolder.equalsIgnoreCase(contactToBeEdited))){
		System.out.println("Number not Found");
		printAfeezMenu();}

	if(!(tempotalNameHolder.equalsIgnoreCase(contactToBeEdited))){
		System.out.println("Name not Found");
		printAfeezMenu();}

	if(!(tempotalLastNameHolder.equalsIgnoreCase(contactToBeEdited))){
		System.out.println("Name not Found");
		printAfeezMenu();}

}

public static void printAllContact() {

	System.out.println("""
			******************
			** ALL CONTACTS **
			******************
	================================================================================
	""");
	
	System.out.println("NAMES\t\t\t\t\t\t\t\tNUMBERS");
	System.out.println("================================================================================");
	for(int count = 0;count < numberList.size();count++) {
				
		System.out.printf("%s\t\t%s\t\t\t\t|\t\t%s%n",nameList.get(count),lastNameList.get(count),numberList.get(count));
	}
	System.out.println("================================================================================");
	System.out.println();
	printAfeezMenu();
}



}

