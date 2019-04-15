package Chapter4;
import java.time.*;
public class Wedding {
	private LocalDate weddingDate;
	private String location;
	private Couple couple;
	
	public Wedding(String y, Couple z) {
		weddingDate = LocalDate.now();
		location = y;
		couple = z;
	}
	
	public LocalDate getWeddingDate() {
		return weddingDate;
	}
	public String getLocation() {
		return location;
	}
	public Couple getCouple() {
		return couple;
	}
}
