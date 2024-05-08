import java.util.Scanner;
 public class TaskFive {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	int sum = 0;
	int multiple = 0;
	int count = 1;

	while(count <= 10) {
		System.out.println("Enter Number");
		int number = scan.nextInt();
		if(number % 2 == 1) {
			sum += number;
			multiple = (number * number);
			System.out.println(multiple);
		}
		count++;
	}
	
	System.out.println(sum);
	
	
	
}



}