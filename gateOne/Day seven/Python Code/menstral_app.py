
from datetime import date
#import java.time.Period;

	date = date.today();

	
	print("""
		:::::::::::::::::::::
		:: SAFE PERIOD APP ::
		:::::::::::::::::::::
		What Do You wish To Check For?
		
		1. Period Length
		2. Next Period
		3. Safe Periods
		4. Ovulation Date
		
			""")
				
	date_of_period_began = input("Enter date of the beginning of your last period (DD/MM/YYYY)")
	
	
	date_of_period_end = input("Enter date of the end of the last period (DD/MM/YYYY)")
	
	length_of_menstral_cycle = int(input("How long does your menstration last"))
	

	date_format = today.strftime("%B %d, %Y")
	
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
