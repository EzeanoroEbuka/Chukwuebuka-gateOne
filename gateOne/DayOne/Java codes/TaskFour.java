import java.util.Scanner;
 public class TaskFour {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	int sum = 0;
	
	for(int count = 1;count <= 10;count++) {
		System.out.println("Enter Number");
		int number = scan.nextInt();
		if(count % 2 == 0)
			sum += number;
	}
	
	System.out.println(sum);
	
	
}



}