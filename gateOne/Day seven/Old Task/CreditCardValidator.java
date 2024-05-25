import java.util.Arrays;
import java.util.Scanner;
  public class CreditCardValidator {
   public static void main(String [] args) {
	
	Scanner scan = new Scanner(System.in);
  
	System.out.println("Hellow, Kindly Enter Card Details to Verify");
	String accNumber = scan.nextLine();
	char firstNumber = accNumber.charAt(0);
	char secondNumber = accNumber.charAt(1);
	int numberLength = accNumber.length();
	String cardStatus = "";
	if(accNumber.length() < 13 || accNumber.length() > 16) 
		cardStatus = ("Invalid Number");
	else{
	if(firstNumber == ('4'))
		 cardStatus = ("Visa Cards");
	else{
	if(firstNumber == ('5'))
		cardStatus = ("Master Card");
	else{
	if(firstNumber == ('6'))
		cardStatus = ("Discover Cards");
	else{
	if(firstNumber == ('3') && secondNumber == ('7'))
		cardStatus = ("American Express Cards");
		
	else{
		cardStatus = ("Invalid Number");
		 }
		}
	    }
	  }
	}
	
	int total = 0;
	int totalTwo = 0;
	String cardValidity = "";
	
	for(int count = numberLength - 2;count >= 0;count = count - 2) {
		
		int convertedValue = (accNumber.charAt(count)) - '0';
		if(convertedValue < 0 || convertedValue > 9){
		 System.out.print("Invalid");break;}

		
		int add = convertedValue * 2;
		if(add > 9){
			add = (add / 10) + (add % 10);}
		total += add;
		
	}
		
	for(int count = numberLength - 1;count > 0;count = count - 2) {
		int convertedValue = (accNumber.charAt(count)) - '0';
		
		if(convertedValue < 0 || convertedValue > 9){
		 System.out.print("Invalid");break;}

		totalTwo += convertedValue;
	}
	if((total + totalTwo) % 10 == 0)
		cardValidity = ("Valid");
	else
		cardValidity =("Invalid");
	
	System.out.println("\n");
	System.out.println("****************************************");

	System.out.println("**Credit Card Type: " + cardStatus);

	System.out.println("**Credit Card Number: " + accNumber);

	System.out.println("**Credit Card Digit: " + numberLength);

	System.out.println("**Credit Card Validity Status: " + cardValidity);

	System.out.println("****************************************");

   }
   
}
