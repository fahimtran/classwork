package Chapter4;
public class Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Test 1: " + computeBill(2.00) + "\nTest 2: " + computeBill(2.00,10) + "\nTest 3: " + computeBill(2.00, 10, 10.00));
	}

	public static double computeBill(double price) {
		
		double bill;
		bill = price + (price * .08);
		return bill;
	}
	
	public static double computeBill(double price, int quantity) {
		
		double bill, subTotal;
		subTotal = price * quantity;
		bill = subTotal + (subTotal * .08);
		return bill;
	}
	
	public static double computeBill(double price, int quantity, double coupon) {
		
		double bill, subTotal;
		subTotal = (price * quantity) - coupon;
		bill = subTotal + (subTotal * .08);
		return bill;
	}
}
