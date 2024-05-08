import random
firstNumber = random.randrange(1,100,13)
secondNumber = random.randrange(1,100,13)

correctAnswer = 0
WrongAnswer = 0
result = 0

for number in range(1,11,1):
	result = secondNumber * firstNumber
	User_answer = int(input(secondNumber + "\t" + "x" "\t" + firstNumber + "\t= "))
	if(userAnwer == result):
		correctAnswer = correctAnswer + 1
		
	else:
		WrongAnswer = wrongAnwer + 1
	   
	print("Correct Answer is: " + correctAnswer)
	print("Wrong Answer is: " + WrongAnswer)