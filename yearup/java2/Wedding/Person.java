package Chapter4;
import java.time.*;
import java.util.Scanner;
public class Person {
	private String first;
	private String last;
	private LocalDate birthday;
	private Scanner input = new Scanner(System.in);
	
	public Person(String x, String y, LocalDate z) {
		first = x;
		last = y;
		birthday = z;
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
}
