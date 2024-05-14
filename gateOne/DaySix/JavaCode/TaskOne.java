import java.util.Scanner;
import java.time.LocalDate;

public class TaskOne { 
 public static void dateOfBirthToAge(String input) {
	
	LocalDate date = LocalDate.now();

	int output = 0;  
	int userYear = 0;
	int currentYear = 0;
	int currentMonth = 0;
	int userMonth = 0;

	if(input.length() != 10){System.out.println("Incomplete Date Inputed.Date Format = DD/MM/YYY");}

	else {
 
		input = input.replace("/","");
		if(input < '0' || input > '9'){System.out.println("wrong Date Inputed.Date Format = DD/MM/YYY");}

		for(int count = input.length() - 4;count < input.length();count++) {  

	 		int convertedInput = (input.charAt(count)) - '0';
			userYear = (userYear * 10) + convertedInput;
		} 
	 	userMonth = (input.charAt(3)) - '0';

		currentYear = date.getYear();
		currentMonth = date.getMonthValue();

		output = currentYear - userYear;

		if(userMonth < currentMonth) {output = output - 1;}
		
						
	}
	System.out.println(output);

}

 public static void main(String[] args) { 

	Scanner input = new Scanner (System.in);
	System.out.println("Enter date");
	String dateInput = input.next();
	dateOfBirthToAge(dateInput);
}
}