name_list = []
last_name_list = []
number_list = []

def remove_contact():
	
	contact_removal = input("Enter Contact Number To Be Removed \n")
	
	for number in number_list:
		#print(number)
		if contact_removal == number:
			number_list.remove(number)
			#fish = number_list.index(number)
			#print(fish) 
			name_list.remove(number)
			#last_name_list.remove(number)
			print(name_list)
			print(number_list)
			print(last_name_list)
			print("Contact removed Successfully")
			afeez_menu()
		
	
		#if number != contact_removal:
		#	print("Number not Found");
			#afeez_menu()

def another_contacts():

	add_contact_again = input("Add Another Contact? (Yes/No)\n");
	
	if add_contact_again.upper() == ("YES"):
		add_contacts()

	if add_contact_again.upper() == ("NO"):
		print("Contact Added Successfully")
		afeez_menu()
	else:
		print("Invalid response")
		another_contacts()
		

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
	Select from option (1 - 6)

	1. Add Contact
	2. Remove Contact
	3. Find Contact by Phone Number
	4. Find Contact by first Name
	5. Find Contact by Last Name
	6. Edit Contact
	0. Back
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

