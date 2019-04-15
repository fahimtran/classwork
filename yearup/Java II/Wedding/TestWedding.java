package Chapter4;
import java.time.*;
public class TestWedding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate time1 = LocalDate.now();
		
		Person example1 = new Person("John", "Creek", time1);
		Person example2 = new Person("Sally", "Sue", time1);
		
		Couple dating1 = new Couple(example1, example2);
		Couple dating2 = new Couple(example2, example1);
		
		Wedding one = new Wedding("Bryan Park", dating1);
		Wedding two = new Wedding("Yellow Stone", dating2);
		
		display(one);
		display(two);
	}
	public static void display(Wedding x) {
		System.out.println("Here's this wedding at " + x.getLocation() 
				+ ", with the couple that has the names " 
				+ x.getCouple().getPersonOne().getFirst() 
				+ " " + x.getCouple().getPersonOne().getLast() 
				+ " and " + x.getCouple().getPersonTwo().getFirst() + " " 
				+ x.getCouple().getPersonTwo().getLast()
				+ ".");
	}
}
