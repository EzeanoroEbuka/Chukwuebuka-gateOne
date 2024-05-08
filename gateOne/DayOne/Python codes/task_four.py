sum = 0
for number in range(1,11,1):
	user_input = int(input("Enter Number \n"))
	if number % 2 == 0:
		sum += user_input

print(sum)

