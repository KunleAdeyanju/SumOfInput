import java.util.Scanner; // import the Scanner class

public class SumOfInput{
	public static void main(String[] args){
		// asking the user for number to sum up to
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = number.nextInt();

		/* long startTime, endTime, elapsedTime;
		startTime = System.currentTimeMillis();
		int sumNum = sumNumbers(n);
		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime; */

		//System.out.println("sumNumbers resulted in: " + sumNum + " sumNumbers took " +elapsedTime + " ms");
		System.out.println(" sumNumbers completes the task in " + sumNumbers(n) + " ms");
		System.out.println("guassianWizardry completes the task in " + guassianWizardry(n) + " ms");


	}
	// Method to add numbers
	public static long sumNumbers(int j){
		int sumLoopMethod = 0;
		long startTime, endTime, elapsedTime;

		startTime = System.currentTimeMillis();
		for(int i = 1; i<=j; i++){
			sumLoopMethod = sumLoopMethod + i;
		}
		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime;

		return elapsedTime;
		//return sumLoopMethod;
	}

	// Guassian Wizardry
	public static long guassianWizardry(int x){
		int sumGuassianMethod = 0;
		long startTime2, endTime2, elapsedTime2;

		startTime2 = System.currentTimeMillis();
		sumGuassianMethod = (x*(x+1))/2;
		endTime2 = System.currentTimeMillis();

		elapsedTime2 = endTime2 - startTime2;

		return elapsedTime2;


		//return sumGuassianMethod;
	}
}
