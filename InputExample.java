import java.util.Scanner;
public class InputExample {
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();

        
        System.out.println("Enter a number: ");
        int answer = in.nextInt();

        System.out.println(name + ", the number your entered is: "
                            + answer);



        //String s1 = "I eat apples";
        //String s2 = "Bananas are my favorite fruit";

		
		/* System.out.print("Introduzca el valor de la variable c: ");
		c = calc.nextDouble(); */
        /* 
        double d = 0, x = 2, y = 2;
        d = Math.pow(x, 4) - Math.sqrt((6 * x) - Math.pow(y, 3));    
        System.out.println("El resultado de la operación es " + d);

        */






        // String s = "\"\"\\\n\"";
        // System.out.println(s);


/*  
		String domain = "";
		String email = "carlosdavidmancia@gmail.com";
		int position = email.indexOf("@");
		domain = email.substring(position + 1 );

		System.out.println(domain);

*/

        // String s2 = "bc";
        // String s2 = "ABC";

        // System.out.println(s1.compareTo(s2));
        // System.out.println(s1.compareTo(s2));

        //System.out.println(s1.substring(6) +  " " + s2.substring(8, 23) );
    } // end method main
} // end class StudentTester

