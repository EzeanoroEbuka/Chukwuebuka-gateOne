import java.util.Scanner;
import java.util.ArrayList;

public class ATMMachine {

	static ArrayList<String> firstNameList = new ArrayList<>();
	static ArrayList<String> lastNameList = new ArrayList<>();
	static ArrayList<String> accountPinList = new ArrayList<>();
	
	static Scanner input = new Scanner(System.in);
	
 public static void main(String... args) {
 
 	printATMMenu();
 
 }
 public static void printATMMenu() {
 
 	System.out.println("""
 	::::::::::::::::::::::::::::::
 	:: WELCOME TO ALPHA BANKING ::
 	::::::::::::::::::::::::::::::
 	
 	Hello....
 	You Can Start By creating A New Account With us today.....
 	
 	1.Create A New Account
 	2.Close Account
 	3.Deposit Money
 	4.Withdraw Money
 	5.Check Account Balance
 	6.Transfer From one account to another
 	7.Change Pin
 		
 		""");
 	int navigator = input.nextInt();
 	switch(navigator) {
 	case 1 -> createAnAccount();
 	case 2 -> closeAccount();
 	//case 3 -> depositMoney();
 	//case 4 -> withdrawMoney();
 	//case 5 -> checkAccountBalance();
 	//case 6 -> transferTOAnotherAccount();
 	//case 7 -> changePin();
 	default -> printATMMenu();
 	}
 	
 }
 
 public static void createAnAccount() {
 
 	System.out.println("Enter your First Name For THis Account");
 	String firstName = input.next();
 	
 	System.out.println("Enter your Last Name For THis Account");
 	String lastName = input.next();
 	
 	String newPin = "";
 	int pinInNumber = 0;
 	do{
 		System.out.println("Create A New  Four Digit Pin For THis Account SetUp");
 		newPin = input.next();
 		
 		for(int count = 0;count < newPin.length();count++)  {
 			
 			pinInNumber = newPin.charAt(count) - '0';
 			if(newPin.length() == 4 && pinInNumber >= 0 && pinInNumber <= 9){
 			}
 						
 			else{System.out.println("Wrong Input,Your PIN must be a Four(4) Digit Valid Numbers");break;}
 		}
 		
 		}while(newPin.length() != 4 || pinInNumber < 0 || pinInNumber > 9);
 		
 	
 	firstNameList.add(firstName);
 	lastNameList.add(lastName);
 	accountPinList.add(newPin);
 
 	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>");
 	System.out.println("Account Created Successfully");
 	System.out.println();
 	
 	printATMMenu();
 	
 }
 public static void closeAccount() {
 
 	System.out.println("Enter your First Name For The Account to be closed");
 	String firstName = input.next();
 
 	System.out.println("Enter your Last Name For The Account to be closed");
 	String lastName = input.next();
 	
 	System.out.println("Enter your Pin For THis Account");
 	String PinToCloseAccount = input.next();
 	
	String temporalPin = "";
	String temporalFirstName = "";
 	String temporalLastName = "";
 	
 	for(int index = 0;index < accountPinList.size();index++) {
 		temporalPin = accountPinList.get(index);
 		temporalFirstName = firstNameList.get(index);
 		temporalLastName = lastNameList.get(index);
 		
 		if(PinToCloseAccount.equals(temporalPin) && firstName.equalsIgnoreCase(temporalFirstName) && lastName.equalsIgnoreCase(temporalLastName)){
 			System.out.println("Account Found");
 			accountPinList.remove(index);
 			firstNameList.remove(index);
 			lastNameList.remove(index);
 			System.out.println("Account Successfully Closed \n");printATMMenu();
 		}

	}
 		if(!(PinToCloseAccount.equals(temporalPin) && firstName.equalsIgnoreCase(temporalFirstName) && lastName.equalsIgnoreCase(temporalLastName))){System.out.println("Account Not Found \n");closeAccount();}
 	
 
 }
 
 
 //class braces
 }	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
