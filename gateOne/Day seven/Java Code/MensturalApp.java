import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
public class MensturalApp {
 public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	LocalDate date = LocalDate.now();

	
	System.out.println("""
		:::::::::::::::::::::
		:: SAFE PERIOD APP ::
		:::::::::::::::::::::
		What Do You wish To Check For?
		
		1. Period Length
		2. Next Period
		3. Safe Periods
		4. Ovulation Date
		
			"""); 
	
	System.out.println("Enter date of the beginning of your last period (DD/MM/YYYY)");
	String periodBegan = input.nextLine();
	
	System.out.println("Enter date of the end of the last period");
	String periodEnd  = input.nextLine();

	System.out.println("How long does your menstration last");
	int mensCycle  = input.nextInt();

	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	LocalDate dateStart = LocalDate.parse(periodBegan,dateFormat);

	LocalDate dateEnd = LocalDate.parse(periodEnd ,dateFormat);

		
	Period periodLength = Period.between(dateStart,dateEnd);
	

	LocalDate ovulation = dateEnd.plusDays(mensCycle / 2);
	
	LocalDate safePeriodBegins = dateEnd.plusDays(1);
	
	LocalDate safePeriodEnds = dateEnd.plusDays(6);

	LocalDate nextPeriod = dateEnd.plusDays(mensCycle);

	System.out.println("Your Period Length is: " + periodLength.getDays() + "Days");

	System.out.println("Your Ovulation is  Either A Day Before " + ovulation.format(dateFormat) + " or A Day After it");

	System.out.println("Your Safe Period Starts on " + safePeriodBegins.format(dateFormat));
	
	System.out.println("Your Safe Period Ends on " + safePeriodEnds.format(dateFormat));

	System.out.println("Your Next Period Starts on " + nextPeriod.format(dateFormat));



}

}