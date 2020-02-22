package Chapter4;

public class Couple {
	private Person personOne, personTwo;
	
	public Couple(Person x, Person y) {
		personOne = x;
		personTwo = y;
	}
	
	public Person getPersonOne() {
		return personOne;
	}
	
	public Person getPersonTwo() {
		return personTwo;
	}
}
