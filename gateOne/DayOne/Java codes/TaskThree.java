import java.util.Scanner;
 public class TaskThree {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	double sum = 0;
	double average = 0;
	for(int count = 0;count < 10;count++) {
		System.out.println("Enter Number");
		int number = scan.nextInt();
		sum += number;
	}
	average = sum / 10;

	System.out.println(sum);
	System.out.printf("%.2f",average);
	
}



}