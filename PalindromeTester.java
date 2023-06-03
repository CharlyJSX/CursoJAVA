import java.util.Scanner;

public class PalindromeTester {
	public static void main(String args[]) {


        
		Scanner in = new Scanner(System.in);

        System.out.println("Enter a word: " );
        String word = in.next();
        int firstPosition = 0;
        int lasPosition = word.length() -1;
        boolean isAPalindrome = true;


        while(firstPosition < lasPosition){
            if(word.charAt(firstPosition) != word.charAt((lasPosition)))
                isAPalindrome = false;
            firstPosition++;
            lasPosition--;
        }

        if(isAPalindrome)
            System.out.println("The word is a Palindrome " );
        else
        System.out.println("The word is not a Palindrome " );




		}




    }