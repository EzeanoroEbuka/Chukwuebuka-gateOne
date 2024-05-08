import java.util.Scanner;
 public class TaskSix {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	double sum = 0;
	double average = 0;

	double counter = 0;
	for(int count = 1;count <= 10;count++) {
		System.out.println("Enter Number");
		int number = scan.nextInt();
		if(number % 2 == 0){sum += number;counter += 1;}
	}
	
	average = sum / counter;
	System.out.println(average);

	
	
}



}