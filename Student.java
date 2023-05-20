package domain; // Package Declaration
import java.util.Scanner; //  An Import Statement for other packages




public class Student { // Class Declaration for this file
	
	private int studentId; // Variable Declartions for this class
	private String name;
	private String ssn;
	private double gpa;
	
	public static void main(String args[]) {
		System.out.println("Hola Mundo");
	
}
	public final int SHCODE = 34958; // A Constant Declaration
			public Student () { // A Constructor
		
	}
	public int getStudentId() { // An accessor Method
		return studentId;
	}
	public void setStudentId(int x) { // A mutator Method
		studentId = x;
	} // end method setStudentId
} // end class Student
