import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade {
  public static void main(String...args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter Number of Student");
	int students = scan.nextInt();
	
	System.out.println("Enter Number of Subjects");
	int subjects = scan.nextInt();
	
	String prompt = ("""
	Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	Saved Successfully
		""");	
	System.out.println(prompt);
	
	
	double average = 0;
	int passMark = 50;

	int[] subjectPass = new int[subjects];
	int[] subjectFail = new int[subjects];
	int[] totalSub = new int[subjects];

	double[] averageSub = new double[subjects];
	int[] indexCollector = new int[2];

	int[][] studentSubject = new int[students][subjects];

	int[] arrTotal = new int[students];
	double[] arrAverage = new double[students];
	
	int[] position = new int[students];
	int[] highestSubScore = new int[subjects]; 
	int[] lowestSubScore = new int[subjects];
	
	for(int count = 0;count < students; count++) {
		int total = 0;
		for(int counter = 0;counter < subjects;counter++) {
			System.out.println("Entering Score for Student " + (count + 1));
			System.out.println("Enter Score for Subject " + (counter + 1));
			int subjectCollector = scan.nextInt();
		
			total += subjectCollector;
			studentSubject[count][counter] = subjectCollector;

			System.out.println("""
			Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			Saved Successfully
				""");		
	 	}
		average = total / subjects;
		arrTotal[count] = total;
		
		arrAverage[count] = average;
		
	}

	for(int counter = 0;counter < subjects; counter++) {
		lowestSubScore[counter] = 100;

		for(int count = 0;count < students;count++) {	
			if(studentSubject[count][counter] < lowestSubScore[counter])
				lowestSubScore[counter] = studentSubject[count][counter];
				indexCollector[0] = (count);

			if(studentSubject[count][counter]  > highestSubScore[counter])
				highestSubScore[counter] = studentSubject[count][counter];
				indexCollector[1] = (count);
		}
	}
	
	for(int count = 0;count < subjects;count++) {
		int subjectTotal = 0;
		int passes = 0;
		int fails = 0;
		double subjectAverage = 0;
		for(int counter = 0;counter < students;counter++) {
			 subjectTotal += studentSubject[counter][count];
			if(studentSubject[counter][count] >= passMark)
				passes += 1;
			else
				fails += 1; 
		}
		subjectAverage = subjectTotal / students;
		totalSub[count] = subjectTotal;
		averageSub[count] = subjectAverage;
		subjectPass[count] = passes;
		subjectFail[count] = fails;
	}

	position = SortFunction.positionSorting(arrTotal);
	




	System.out.printf("=========================================================================================================================\n");
	System.out.println();	
	System.out.printf("STUDENT\t\t");
	for(int count = 1;count <= subjects;count++) {
		System.out.print("SUB" + count + "\t");
	}

	System.out.printf("TOT \t AVE \t   POS\n");
	System.out.println();
	System.out.printf("==========================================================================================================================\n");

	for(int count = 0;count < students; count++) {
		System.out.print("Student " + (count +1) + "\t ");
		
		for(int counter = 0;counter < subjects;counter++) {
			System.out.print(studentSubject[count][counter] + "\t");
		}

		System.out.print(arrTotal[count] + "\t");

		System.out.printf("%.2f\t  ",arrAverage[count]);

		System.out.print(position[count]);
		System.out.println();
	}

	System.out.printf("=========================================================================================================================\n");
	System.out.println();
	System.out.printf("=========================================================================================================================\n");
	

	System.out.println();
	
	System.out.printf("======================================================\n");
	System.out.println("SUBJECT SUMMARY");
		
	for(int j = 0; j < subjects;j++) { 
		System.out.printf("======================================================\n");
		System.out.println("SUBJECT " + (j + 1));

		System.out.printf("Highest scoring Student is:  Student %d scoring %d%nLowest scoring Student is:  Student %d scoring %d%n",indexCollector[1],highestSubScore[j],indexCollector[0],lowestSubScore[j]);
		
		System.out.printf("Total Score is: %d%nAverage Score is: %.2f%nNumber of Passes: %d%nNumber of Fails: %d%n",totalSub[j],averageSub[j],subjectPass[j],subjectFail[j]);
		System.out.printf("======================================================\n");
		System.out.println();
	}



}

}	

