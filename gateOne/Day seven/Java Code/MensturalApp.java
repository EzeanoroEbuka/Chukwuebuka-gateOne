import java.time.LocalDate;
import java.util.Scanner;

public class MensturalApp {
 public static void main(String... args) {

  	Scanner input = new Scanner(System.in);

 	LocalDate date = LocalDate.now();

	int output = 0;  
	int userYear = 0;
	int currentYear = 0;
	int currentMonth = 0;
	int userMonth = 0;

	System.out.println("Enter date when last period began");
	String dateBeganPeriod = input.nextLine();

	System.out.println("Enter date when last period stop");
	String dateStopPeriod = input.nextLine();

	date = date.replace("/","");

	for(int count = date.length();count <= 0;count--) {  

	 		int convertedInput = (input.charAt(count)) - '0';
			userYear = (userYear * 10) + convertedInput;
	}
	System.out.println(date);

	System.out.println(userYear  );





	
 }


}