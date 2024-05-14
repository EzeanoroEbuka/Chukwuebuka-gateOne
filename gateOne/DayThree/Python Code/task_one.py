import random

correct_answer = 0
wrong_anwer = 0
result = 0

for number in range(1,11,1):

	firstNumber = random.randrange(1,100,)
	secondNumber = random.randrange(1,100,13)

	result = secondNumber * firstNumber
	print(f"{secondNumber}\tx\t{firstNumber}\t=",end =" ")
	user_answer = int(input())

	if(user_answer == result):
		correct_answer = correct_answer + 1
		print()
		print(f"The Answer: {result} is Correct")
		

	else:
		wrong_anwer = wrong_anwer + 1	
		print()
		print(f"The Answer: {user_answer} is Wrong")
		print(f"The Correct Answer is: {result}")
		print()

print()
print(f"Total Correct Answer is: {correct_answer}\nTotal Wrong Answer is: {wrong_anwer}")
