public class TaskSeventeen {
  public static void main(String[] args) {

	int multiple = 1;
	int sum = 0;
	for(int count = 1;count <= 10;count++) {
		
		if(count % 4 == 0){
			for(int counter = 1;counter <= 5;counter++){
				multiple = multiple * count;
				sum += multiple;
			}
			System.out.print(sum + " ");
			sum = 0;		
			multiple = 1;
		}
	}			
   }

}