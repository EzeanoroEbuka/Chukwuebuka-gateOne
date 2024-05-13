import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {
public static void main(String... args) {

	 Scanner scanner  = new Scanner(System.in);
	 ArrayList<String> nameAndNumberList = new ArrayList<>(); 
	//nameAndNumber = addContacts();
	addContacts();

	anotherContacts();
}

public static void addContacts() {

	Scanner scanner  = new Scanner(System.in);
	ArrayList<String> nameAndNumberList = new ArrayList<>();

	System.out.println("""
	:::::::::::::::::::::
	::  ADD CONTACTS   ::
	:::::::::::::::::::::
			""");
	System.out.println("Enter New Contact Name");
	String contactName = scanner.nextLine();
	
	nameAndNumberList.add(contactName);

	System.out.println("Enter New Contact Telephone");
	String contactNumber = scanner.nextLine();

	nameAndNumberList.add(contactNumber);
	

}

public static void anotherContacts() {

	Scanner scanner  = new Scanner(System.in);
	
	System.out.println("Add Another Contact? (Yes/No)");
	String addContactAgain = scanner.nextLine();
	if(addContactAgain.equalsIgnoreCase("Yes")){
		addContacts();}
	else{
		System.out.println("Contact Added Successfully");
	  }

}
	
}