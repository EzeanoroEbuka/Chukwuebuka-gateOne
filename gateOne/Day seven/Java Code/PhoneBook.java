import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {
 private  static Scanner input = new Scanner(System.in);
 private static Scanner scanner = new Scanner(System.in);
 static ArrayList<String> nameList = new ArrayList<>(); 
 static ArrayList<String> numberList = new ArrayList<>();
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
	case 3 -> findByNumber();
	//case 4 -> findByFirstName();
	//case 5 -> findByLastName();
	//case 6 -> editContact();
	case 0 -> afeezMenu();
	default -> afeezMenu();

	}
		
}

public static void addContacts() {

	System.out.println("""
	:::::::::::::::::::::
	::  ADD CONTACTS   ::
	:::::::::::::::::::::
			""");
	
	System.out.println("Enter New Contact Name");
	String contactName = input.nextLine();
	
	System.out.println("Enter New Contact Telephone");
	String contactNumber = input.nextLine();

	if(contactNumber.length() == 11 && contactNumber.charAt(0) == '0'){
	numberList.add(contactNumber);
	nameList.add(contactName);

	System.out.println("Contact created successfully");
	anotherContacts();

	
	} 
	else {
		System.out.println("Incorrect Number");
		
		addContacts();
	    }
}
public static void anotherContacts() {
	

	System.out.println("Add Another Contact? (Yes/No)");
	String addContactAgain = input.nextLine();
	if(addContactAgain.equalsIgnoreCase("Yes")){
		addContacts();}

	if(addContactAgain.equalsIgnoreCase("No")){
		System.out.println("""
			Contact Added Successfully
			""");
		System.out.println(nameList);
		System.out.println(numberList);
		afeezMenu();}
	else {
		System.out.println("Invalid response");
		anotherContacts();
		
	} 
}

//public static void removeContact() {
	
	//System.out.println("Enter 
	//for(int count = 0;count < nameList.length;count++) {
		

//}
public static void findByNumber() {

	System.out.println("Enter Phone Number");
	String numberIncontact = input.nextLine();
	int count = 0;

	for(String num : numberList) {
	num = numberList.get(count);
		if(num == numberIncontact){
			System.out.print(num);
		}
	}
	afeezMenu();
}
//class	

}

