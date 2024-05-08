public class TaskSixteen {
  public static void main(String[] args) {

	int multiple = 1;
	for(int count = 1;count <= 10;count++) {
		if(count % 4 == 0)
			for(int counter = 1;counter <= 5;counter++){
				multiple = multiple * count;
				System.out.print(multiple + " ");
				}
		multiple = 1;
		System.out.print(" ");
	}
}

}