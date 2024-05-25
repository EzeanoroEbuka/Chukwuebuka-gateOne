
from datetime import date
#import java.time.Period

date = date.today()

	
print("""
	:::::::::::::::::::::
	:: SAFE PERIOD APP ::
	:::::::::::::::::::::
	What this app Checks For....
	
	1. Period Length
	2. Next Period
	3. Safe Periods
	4. Ovulation Date
	
	""")

date_of_period_began = input("Pls Kindly Enter the date of the beginning of your last period (DD/MM/YYYY)\n")
	
	
date_of_period_end = input("Pls Kindly Enter the date of the end of the last period (DD/MM/YYYY)\n")
	
length_of_menstral_cycle = int(input("How long does your menstration last \n"))
	

date_format = today.strftime("%B %d, %Y")
	

"""
#LocalDate date_start = LocalDate.parse(periodBegan,dateFormat)

#LocalDate date_end = LocalDate.parse(periodEnd ,dateFormat)

		
#Period periodLength = Period.between(dateStart,dateEnd)
	

LocalDate ovulation = dateEnd.plusDays(mensCycle / 2)
	
LocalDate safePeriodBegins = dateEnd.plusDays(1)
	
LocalDate safePeriodEnds = dateEnd.plusDays(6)

LocalDate nextPeriod = dateEnd.plusDays(mensCycle)

print("Your Period Length is: " + periodLength.getDays() + "Days")

print("Your Ovulation is  Either A Day Before " + ovulation.format(dateFormat) + " or A Day After it")

print("Your Safe Period Starts on " + safePeriodBegins.format(dateFormat))
	
print("Your Safe Period Ends on " + safePeriodEnds.format(dateFormat))

print("Your Next Period Starts on " + nextPeriod.format(dateFormat))
"""

