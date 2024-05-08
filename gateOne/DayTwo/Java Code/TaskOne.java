import java.util.Scanner;
public class TaskOne {
 public static void main(String[] args) { 

	Scanner scanner = new Scanner(System.in);

	int[] arrOfScores = new int[10];

	for(int count = 0;count < 10;count++) {
		System.out.println("Enter Score");
		int scores = scanner.nextInt();
		arrOfScores[count] = scores;
		
	}

}

}