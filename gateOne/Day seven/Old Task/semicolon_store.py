from datetime import date

user_buy_list = []
how_many_piece_list = []
price_per_piece_list = []
total_list = []

add_more_item= "YES"
current_date  = date.today()


customer_name = input("What is the Customer's Name? \n")
	
total = 0
	 
while(add_more_item.upper()  == "YES"):

	item_name = input("What did the user buy? \n")
	
	pieces  = int(input("How Many Pieces? \n"))
	  
	if(pieces < 1):
		print("Invalid Quantity")

	price_per_unit = float(input("How much per unit? \n"))
	
	if(price_per_unit < 1):
		print("Invalid Price")

	total = pieces * price_per_unit

	user_buy_list.append(item_name)
	how_many_piece_list.append(pieces)
	price_per_piece_list.append(price_per_unit)
	total_list.append(total)

		
	add_more_item = input("Add more items? \n")
	
	if(add_more_item.upper()  == "NO"):
		break
	  
if(total < 1):
	print("Invalid Quantity")
		
cashier_name = input("What is your Name(Cashier's Name) \n")
	 
discount = int(input("How much Discount will customer get? \n"))

print("""

SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULEY WAY,SABO YABA,LAGOS.
TEL: 03293828343
	""")
		
print(f" DATE:   {current_date}")
print(" Cashier: " + cashier_name)
print(" Customer Name: " + customer_name)

print("""
============================================================================
	ITEM	QTY	PRICE	TOTAL(NGN)
----------------------------------------------------------------------------
	  """)
	  
count = 0

sub_total = 0

while(count < len(user_buy_list)) :
	print("\t" + user_buy_list[count] + "\t" + str(how_many_piece_list[count])
	   + "\t" + str(price_per_piece_list[count]) + "\t" + str(total_list[count]))
	   
	sub_total += total_list[count]
	count = count + 1
	
discount_in_percent = (discount / 100)
discounted_total = (sub_total * discount_in_percent)
vat = (sub_total * 17.5) / 100
bill = (sub_total - discounted_total) + vat
	
print("""

-------------------------------------------------------------------------------------------
	  		
		""")
	   
print(f"\t\t  Sub Total: \t{sub_total:.2f}\n")

print(f"\t\t   Discount: \t{discounted_total:.2f}\n")

print(f"\t\tVAT @ 17.50: \t{vat:.2f}\n")

print("""

============================================================================================

		""")
	
print(f"\t\tBill Total: \t{bill:.2f}\n")

print("""

============================================================================================

		""")
	   
print(" THIS IS NOT A RECEIPT KINDLY PAY " + " " + str(bill))

print("""

============================================================================================

	  	""")
	  		
cash_received = float(input("How much did the customer give to you? \n"))
	
print("""


SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULEY WAY,SABO YABA,LAGOS.
TEL: 03293828343
	""")
	  
print(" DATE: " + str(current_date))
print(" Cashier: " + cashier_name)
print(" Customer Name: " + customer_name)
	
		
		
print("""	

============================================================================
	ITEM	QTY	PRICE	TOTAL(NGN)
----------------------------------------------------------------------------
		""")
	
counter = 0

sub_totals = 0

while(counter < len(user_buy_list)):
	print("\t" + str(user_buy_list[counter]) + "\t" + str(how_many_piece_list[counter])
	   + "\t" + str(price_per_piece_list[counter]) + "\t" + str(total_list[counter]))
	   
	sub_totals += total_list[counter]
	counter = counter + 1
 
discount_in_percent2 = (discount / 100)
discounted_total2 = (sub_totals * discount_in_percent2)
vat2 = (sub_totals * 17.5) / 100
bill2 = (sub_totals - discounted_total2) + vat2
balance = (cash_received - bill2)

print("""

-------------------------------------------------------------------------------------------
	  		
		""")
			
print(f"\t\t  Sub Total: \t{sub_totals:.2f}\n")

print(f"\t\t   Discount: \t{discounted_total2:.2f}\n")

print(f"\t\tVAT @ 17.50: \t{vat:.2f}\n")

print("""

============================================================================================

			""")
	  

print(f"\t\tBill Total: \t{bill2:.2f}\n")

print(f"\t\tAmount Paid: \t{cash_received:.2f}\n")

print(f"\t\tBalance: \t{balance:.2f}\n")

print("""

============================================================================================
		THANK YOU FOR YOUR PATRONAGE.....
		""")

print("""

============================================================================================

	 	""")
	   



