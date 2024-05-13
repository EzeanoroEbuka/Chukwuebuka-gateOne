import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {
 static Scanner scanner = new Scanner(System.in);
 static ArrayList<String> nameAndNumberList = new ArrayList<>(); 
public static void main(String... args) {

		afeezMenu();
}
public static void afeezMenu() {
		 	
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
	0. Back
			""");
	int navigate = scanner.nextInt();
	switch(navigate) {
	case 1 -> addContacts();
	//case 2 -> removeContact();
	//case 3 -> findByNumber();
	//case 4 -> findByFirstName();
	//case 5 -> findByLastName();
	//case 6 -> editContact();
	case 0 -> afeezMenu();
	}
		
	addContacts();
	

}

public static void addContacts() {

	System.out.println("""
	:::::::::::::::::::::
	::  ADD CONTACTS   ::
	:::::::::::::::::::::
			""");
	scanner.nextLine();
	System.out.println("Enter New Contact Name");
	String contactName = scanner.nextLine();
	//scanner.next();
	nameAndNumberList.add(contactName);

	System.out.println("Enter New Contact Telephone");
	String contactNumber = scanner.next();

	if(contactNumber.length() == 11 && contactNumber.charAt(0) == '0'){
	nameAndNumberList.add(contactNumber);
	System.out.println("Contact created successfully");
	anotherContacts();

	System.out.println(nameAndNumberList);
	} 
	else {
		System.out.println("Incorrect Number");
		
		addContacts();
	    }
}
public static void anotherContacts() {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Add Another Contact? (Yes/No)");
	String addContactAgain = scanner.nextLine();
	if(addContactAgain.equalsIgnoreCase("Yes")){
		addContacts();}

	if(addContactAgain.equalsIgnoreCase("No")){
		System.out.println("""
			Contact Added Successfully
			""");
		afeezMenu();}
	else {
		System.out.println("Invalid response");
		anotherContacts();
		
	} 
}

//class	
}