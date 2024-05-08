import java.util.Scanner;
 public class TaskOne {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	int sum = 0;
	for(int count = 0;count < 10;count++) {
		System.out.println("Enter Number");
		int number = scan.nextInt();
		sum += number;
	}
	System.out.println(sum);
}



}