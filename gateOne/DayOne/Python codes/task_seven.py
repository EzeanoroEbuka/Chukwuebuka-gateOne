sum = 0
average = 0
COUNTER = 0
for number in range(1,11,1):
	user_input = int(input("Enter Number \n"))
	if user_input % 2 == 0:
		sum += user_input
		COUNTER = COUNTER + 1

average = sum / COUNTER

print(sum)
print(average)

