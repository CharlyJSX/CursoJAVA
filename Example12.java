import java.util.Scanner;

public class Example12 {
    
  
	/**
	 * @param args
	 */
	public static void main(String args[]) {

        boolean quit = false;
        int num1 = 10, num2 = 6, answer = 0;
        char operand = ' ';
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Plese enter a mathematical operand ");
            String input = in.next();
             operand = input.charAt(0);

            switch(operand){
                case '*': answer = num1 * num2;
                    break;
                case '+': answer = num1 + num2;
                    break;
                case '-': answer = num1 - num2;
                    break;
                case '/': answer = num1 / num2;
                default: System.out.println("Invalid input.");
            }
            System.out.println("El resultado de la operación es: " + answer);
            System.out.println("Quit? Y/N");
                
                if(in.next().equalsIgnoreCase("Y"))
                    quit = true;
            } while(!quit);
        }         
    }

