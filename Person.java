public class StudentTester {
	public static void main(String args[]) {

		//String s1 = "I eat apples";
		//String s2 = "Bananas are my favorite fruit";



		String domain = "";
		String email = "carlosdavidmancia@gmail.com";
		int position = email.indexOf("@");
		domain = email.substring(position + 1 );

		System.out.println(domain);

		// String s2 = "bc";
		// String s2 = "ABC";

		// System.out.println(s1.compareTo(s2));
		// System.out.println(s1.compareTo(s2));

		//System.out.println(s1.substring(6) +  " " + s2.substring(8, 23) );
	} // end method main
} // end class StudentTester
