
public class Circle {

	private double radius;
	private double diameter; 
	private double area;
	
	public Circle() {
		
		radius = 1;
		diameter = radius * 2;
		area = Math.PI * (radius * radius);	
	}
	
	public void setRadius(int x) {
		
		radius = x;
		diameter = radius * 2;
		area = Math.PI * (radius * radius);
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	public double getDiameter() {
		
		return diameter;
	}
	
	public double getArea() {
		
		return area;
	}
	
}
