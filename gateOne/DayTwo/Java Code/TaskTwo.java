import java.util.Scanner;

public class TaskTwo {
 public static void main(String[] args) { 

	Scanner scanner = new Scanner(System.in);

	int[] arrOfScores = new int[10];

	for(int count = 0;count < 10;count++) {
		System.out.println("Enter Score");
		int scores = scanner.nextInt();
		arrOfScores[count] = scores;
	}

	System.out.println();

	for(int counter = 0;counter < 10;counter++) {

		System.out.println(arrOfScores[counter]);
	}




}

}