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
	return outPut;

}

}