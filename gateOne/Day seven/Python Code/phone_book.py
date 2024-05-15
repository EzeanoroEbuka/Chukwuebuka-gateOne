name_list = []
last_name_list = []
number_list = []

def edit_contact():

	print("""
			******************
			** ALL CONTACTS **
			******************
================================================================================
	""")
	
	print("NAMES\t\t\t\t\tNUMBERS")
	print("================================================================================")
	for count in range(0,len(number_list),1):		
		print(f"{name_list[count]}\t{last_name_list[count]}  |\t\t\t\t{number_list[count]}\n")
	
	print("================================================================================")
	print("\n")

	navigate = int(input("press '0' to return to Menu: "))
	if navigate == 0:
		afeez_menu()
	else:
		edit_contact()
	
def find_by_last_name():

	contact_last_name = input("Enter Contact Last Name\n");
	number = ""
	name = ""
	last_name = ""

	for count in range(0,len(last_name_list),1):
		number = number_list[count]
		name = name_list[count]
		last_name = last_name_list[count]

		if(last_name.upper() == contact_last_name.upper()):
			print(f"{name}  {last_name}  \n{number}\n")
	
	if(last_name.upper() != contact_last_name.upper()):
		print("Contact Not Found")

	print("\n")
	navigate = int(input("press '0' to return to Menu: "))
	if navigate == 0:
		afeez_menu()
	else:
		find_by_last_name()
	
def find_by_first_name():

	contact_first_name = input("Enter Contact First Name\n");
	number = ""
	name = ""
	last_name = ""

	for count in range(0,len(name_list),1):
		number = number_list[count]
		name = name_list[count]
		last_name = last_name_list[count]

		if(name.upper() == contact_first_name.upper()):
			print(f"{name}  {last_name}  \n{number}\n")
				
	if(name.upper() != contact_first_name.upper()):
		print("Contact Not Found")

	print("\n")
	navigate = int(input("press '0' to return to Menu: "))
	if navigate == 0:
		afeez_menu()
	else:
		find_by_first_name()
	

def find_by_number():

	number_in_contact = input("Enter Phone Number \n");
	
	number = ""
	name = ""
	last_name = ""

	for count in range(0,len(number_list),1):
		number = number_list[count]
		name = name_list[count]
		last_name = last_name_list[count]

		if(number == number_in_contact):
			print(f"{name}  {last_name}  \n{number}\n")
	
	if(number != number_in_contact):
		print("Contact Not Found")
		
	print("\n")
	navigate = int(input("press '0' to return to Menu: "))
	if navigate == 0:
		afeez_menu()
	else:
		find_by_number()


def remove_contact():
	
	contact_removal = input("Enter Contact Number To Be Removed \n")
	
	number = ""
	name = ""
	last_name = ""
	for count in range(len(number_list)):
		number = number_list[count]
		name = name_list[count]
		last_name = last_name_list[count]

		
		if(number.upper() == contact_removal.upper()): 
			number_list.remove(number)
			name_list.remove(name)
			last_name_list.remove(last_name)

			print("Contact removed Successfully")
			print("\n")

			navigate = int(input("press '0' to return to Menu: "))
			if navigate == 0:
				afeez_menu()
			else:
				remove_contact()

	if(number.upper() != contact_removal.upper()):
		print("Number not Found");
		print("\n")

		navigate = int(input("press '0' to return to Menu: "))
		if navigate == 0:
			afeez_menu()
		else:
			remove_contact()

def another_contacts():

	add_contact_again = input("Add Another Contact? (Yes/No)\n");
	
	if add_contact_again.upper() == ("YES"):
		add_contacts()

	if add_contact_again.upper() == ("NO"):
		print("Contact Added Successfully")

		print("\n")
		navigate = int(input("press '0' to return to Menu: "))
		if navigate == 0:
			afeez_menu()
		else:
			another_contacts()
	else:
		print("Invalid response")
		
		print("\n")
		navigate = int(input("press '0' to return to Menu: "))
		if navigate == 0:
			afeez_menu()
		else:
			add_contacts()


		

def add_contacts():   

	print("""
	:::::::::::::::::::::
	::  ADD CONTACTS   ::
	:::::::::::::::::::::
	       """);
	
	contact_name = input("Enter New Contact First Name \n")
		
	contact_last_name = input("Enter New Contact Last Name\n")
	
	
	contact_number = input("Enter New Contact Telephone\n")
	

	
	number_list.append(contact_number)
	name_list.append(contact_name)
	last_name_list.append(contact_last_name)

	print("Contact created successfully")
	another_contacts();
	


def afeez_menu():
		 	
	print('''
		:::::::::::::::::::::::
		::  AFEEZ CONTACTS   ::
		:::::::::::::::::::::::
	
	Welcome Afeez.....
	Select from  Menu option (1 - 6)

	1. Add Contact
	2. Remove Contact
	3. Find Contact by Phone Number
	4. Find Contact by first Name
	5. Find Contact by Last Name
	6. Edit Contact
	       ''')

	navigate = int(input("Navigate: "))
	match navigate:
		case 1 : add_contacts()
		case 2 : remove_contact()
		case 3 : find_by_number()
		case 4 : find_by_first_name()
		case 5 : find_by_last_name()
		case 6 : edit_contact()
		case 0 : afeez_menu()
		case _ :  afeez_menu()

afeez_menu()

