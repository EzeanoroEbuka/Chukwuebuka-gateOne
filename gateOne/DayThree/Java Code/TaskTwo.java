import java.util.Scanner;
import java. util.Random; 
public class TaskTwo {
 public static void main(String[] args) { 

	Random rand = new Random();
	Random operatorChoice = new Random();

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

		System.out.print(secondNumber + "\tX\t" + firstNumber + "\t= ");
		int userAnwer = scanner.nextInt();

		System.out.println();
		if(userAnwer == result){System.out.printf("The Answer: %d is Correct%n",result);correctAnswer++;}
		
		else{
			System.out.println();
			System.out.printf("The Answer: %d is  Wrong %n",userAnwer);WrongAnswer++;
			System.out.printf("The Correct Answer is: %d",result);
			System.out.println();
		  }

	}
	System.out.println();
	System.out.println("Total Correct Answer is: " + correctAnswer);	
	System.out.println("Total Wrong Answer is: " + WrongAnswer);	
	
	

}



} 	