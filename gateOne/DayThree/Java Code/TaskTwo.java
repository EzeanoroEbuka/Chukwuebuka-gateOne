import java.util.Scanner;
import java. util.Random; 
public class TaskTwo {
 public static void main(String[] args) { 

	Random rand = new Random();
	Scanner scanner = new Scanner(System.in);
	
	int highestRange = 100;
	int lowestRange = 1;

	int correctAnswer = 0;
	int WrongAnswer = 0;

	int firstNumber = 0;
	int secondNumber = 0;

	for(int count = 1;count <= 10;count++) {
	firstNumber = rand.nextInt(lowestRange,highestRange);
	secondNumber = rand.nextInt(lowestRange,highestRange);
	
	int result = (secondNumber) * (firstNumber);

	System.out.print(secondNumber + "\tx\t" + firstNumber + "\t= ");
	int userAnwer = scanner.nextInt();

	if(userAnwer == result){correctAnswer++;}
		
	else{
		WrongAnswer++;
	   }
	System.out.println("Correct Answer is: " + correctAnswer);	
	System.out.println("Wrong Answer is: " + WrongAnswer);	
	
	}
/**
	//for(int count = 1;count <= 10;count++) {

	int result = (inputTwo) + (input);

	System.out.print(inputTwo + "\t+\t" + input + "\t= ");
	int userAnwer = scanner.nextInt();

	if(userAnwer == result){correctAnswer++;}
		
	else{
		WrongAnswer++;
	 }
	System.out.println("Wrong Answer is: " + WrongAnswer);
	System.out.println("Correct Answer is: " + correctAnswer);	
	//}

	**/

}



} 	