
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle one = new Circle();
		Circle two = new Circle();
		Circle three = new Circle();
		
		one.setRadius(2);
		two.setRadius(20);
		
		System.out.println(one.getRadius() + " " + one.getDiameter() + " " + one.getArea());
		System.out.println(two.getRadius() + " " + two.getDiameter() + " " + two.getArea());
		System.out.println(three.getRadius() + " " + three.getDiameter() + " " + three.getArea());
	}

}
