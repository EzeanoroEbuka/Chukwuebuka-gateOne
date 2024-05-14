import java.util.Scanner;
public class PhoneBook {
public static void main(String... args) {

	static Scanner scanner  = new Scanner(System.in);

	addContacts()

}

public static void addContacts() {

	System.out.println("""
	:::::::::::::::::::::
	::  ADD CONTACTS   ::
	:::::::::::::::::::::
			""")
	System.out.println("Enter New Contact Name");
	String contactName = scanner.nextLine();
	
	System.out.println("Enter New Contact Telephone");
	String contactNumber = scanner.nextLine();

}

	
}