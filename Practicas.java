import java.util.Scanner;

public class Practicas {
	public static void main(String args[]) {



		System.out.println("Digite 10 números para hacer la sumatoria: " );

		Scanner in = new Scanner(System.in);
		int numInputs = 0;
		int sum = 0;
		while(numInputs < 10){

			int input = in.nextInt();
			sum+=input;
				numInputs++;
				
		}



		System.out.println("The sum of those ten numbres is: " + sum);






	} // end method main
} // end class StudentTester

