public class TaskFour {
public static int[] returnEvenIndexes(int[] input) {

	int[] output = new int[input.length];

	for(int count = 0;count < 10;count++) {
		if(count % 2 == 0)
			output[count] = input[count];
	}
	return output;
		
}

}

