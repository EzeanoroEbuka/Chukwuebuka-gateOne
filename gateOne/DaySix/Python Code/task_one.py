from datetime import date
def date_of_birth_to_age(user_input):
	
	current_date = datetime.date.today()

	output = 0   
	user_year = 0
	current_year = 0
	current_month = 0
	user_month = 0

	if len(user_input) != 10:
		print("Incomplete Date Inputed.Date Format = DD/MM/YYY")

	else:
 
		user_input = user_input.replace("/","")

		for character in range((len(user_input) - 4),len(user_input),1): 
			converted_input = (user_input.charAt(count)) - '0'
			user_year = (user_year * 10) + converted_input

	 	user-month = user_input.charAt(3) - '0'

		current-year = current_date.getYear()
		current_month = current_date.getMonthValue()

		output = current_year - user_year

		if user_month < current_month:
			output = output - 1
		
		print(output)
						
	
user_date = input("Enter Date of Birth");
	
date_of_birth_to_age(user_date);
         


