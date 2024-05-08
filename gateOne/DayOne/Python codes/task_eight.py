sum = 0
for number in range(1,11,1):
	user_input = int(input("Enter Number \n"))
	if user_input > 0 and user_input < 100:
		sum += user_input
		
print(sum)


