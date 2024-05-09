import java.util.Scanner;
public class TaskOne {
 public static void main(String[] args) { 

	Scanner input = new Scanner (System.in);
	
	char[][] scoreInput = new char[3][3];

	int positionTwo = 0;
	int newPosition = 0;

	for(int counter = 0;counter < 3;counter++) {

		for(int count = 0;count < 3;count++) {
			System.out.println("""
			Select Character Position
			1	2	3
			11	12	13
			21	22	23
				""");
			int position = input.nextInt();
			
			if(position == 1||position == 2||position == 3||position == 11||position == 12||position == 13||position == 21||position == 22||position == 23){
				positionTwo = position % 10;
				newPosition = position / 10;}
			
			else{
				System.out.print("Invalid!! Pls Select from the list of Numbers Given");counter--;continue;}


			System.out.println("Enter Character");
			char characterInput = input.next().charAt(0);
			char newCharacter = Character.toUpperCase(characterInput);

			if(newCharacter == 'X' || newCharacter == 'O'){
				scoreInput[newPosition][positionTwo -1] = newCharacter;}
			else{
				System.out.print("Invalid!! Pls Enter 'X' or 'O'\n");count--;continue;}

			System.out.println();
			System.out.println("_______________________");
			for(int counterTwo = 0;counterTwo < 3;counterTwo++) {
		
				for(int countTwo = 0;countTwo < 3;countTwo++) {
					System.out.printf("  %s  |\t",scoreInput[counterTwo][countTwo]);
		
				}
				System.out.println();
				System.out.println("_______________________");
				
			}
		}			
	}

	System.out.println();
	System.out.println("_______________________");
	for(int counter = 0;counter < 3;counter++) {
		
		for(int count = 0;count < 3;count++) {
			System.out.printf("  %s  |\t",scoreInput[counter][count]);
		
		}
		System.out.println();
		System.out.println("_______________________");

	}
}



}