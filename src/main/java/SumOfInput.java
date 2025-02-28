import java.util.Scanner; // import the Scanner class

public class SumOfInput{
	public static void main(String[] args){
		// asking the user for number to sum up to
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = number.nextInt();

		System.out.println(sumNumbers(n));


	}
	// Method to add numbers
	public static int sumNumbers(int j){
		int sum = 0;
		for(int i = 1; i<=j; i++){
			sum = sum + i;
		}
		return sum;
	}
}
