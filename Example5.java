import java.util.Scanner;

public class Example5 {
    

	public static void main(String args[]) {

     
       
      
	    Scanner in = new Scanner(System.in);
        int numInputs = 10;
        

        int sum = 0;
        int input = 0;
        for(int i = 0; i < numInputs; i++){
            input = in.nextInt();
            sum+=input;
            
        }

        System.out.println(("The sum of those the numbers is: " + sum));
     
    }
}
    
