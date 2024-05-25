cardNumber = input("Hellow, Kindly Enter Card Details to Verify\n")
	
firstNumber = cardNumber[0]
secondNumber = cardNumber[1]
numberLength = len(cardNumber)
cardStatus = ""
if(len(cardNumber) < 13 or len(cardNumber) > 16):
	cardStatus = ("Invalid Card")
elif(firstNumber == ('4')):
	cardStatus = ("Visa Cards")
	
elif(firstNumber == ('5')):
	cardStatus = ("Master Card")
	
elif(firstNumber == ('6')):
	cardStatus = ("Discover Cards")
	
elif(firstNumber == ('3') and secondNumber == ('7')):
	cardStatus = ("American Express Cards")
		
else:
	cardStatus = ("Invalid Card")
	
total = 0
totalTwo = 0
cardValidity = ""
for count in range((numberLength - 2),-1,-2):
		
	convertedValue = int(cardNumber[count])
	if(convertedValue < 0 or convertedValue > 9):
		print("Invalid")
		break
	
	add = convertedValue * 2
	if(add > 9):
		add = (add // 10) + (add % 10)
	total += add
	
for count in range((numberLength - 1),0,-2):
	convertedValue = int(cardNumber[count])
	if(convertedValue < 0 or convertedValue > 9):
		print("Invalid")
		break

	totalTwo += convertedValue
	
if((total + totalTwo) % 10 == 0):
	cardValidity = ("Valid")
else:
	cardValidity =("Invalid")
		
print("\n")
print("****************************************")

print("**Credit Card Type: " + cardStatus)

print("**Credit Card Number: " + cardNumber)

print(f"**Credit Card Digit:  {numberLength}")

print("**Credit Card Validity Status: " + cardValidity)

print("****************************************")
	
	
	
	
