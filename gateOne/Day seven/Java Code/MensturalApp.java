import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class MensturalApp {
 public static void main(String... args) {

  	Scanner input = new Scanner(System.in);

 	
	int output = 0;  
	int userYear = 0;
	int currentYear = 0;
	int currentMonth = 0;
	int userMonth = 0;

	System.out.println("Enter date when last period began");
	String dateBeganPeriod = input.nextLine();

	System.out.println("Enter date when last period stop");
	String dateStopPeriod = input.nextLine();

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
	
	LocalDate date = LocalDate.parse(dateStopPeriod);

	//String newDate = formatter(date);
 	System.out.println(date);

	System.out.println(userYear);





	
 }


}