package domain;

public class Person {

	String personName;
	int personAge;
	
	public Person (String personName, int personAge ) {
		this.personName = personName;
		this.personAge = personAge;
		
	}

	public String getPersonName() {
		return personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	
}
