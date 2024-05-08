import java.util.Scanner;
 public class TaskNine {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	int sum = 0;
	
	for(int count = 1;count <= 10;count++) {
		System.out.println("Enter Number");
		int number = scan.nextInt();
		if(number > 0){
			sum += number;}
	}
	
	
	System.out.println(sum);
		

	
	
}


}