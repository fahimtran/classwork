
public class TestInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice a, b, c, d, e, f, g;
		a = new Invoice(1243, 3.50, 30, 1, 2012);
		b = new Invoice(1234, 3.51, 30, 3, 2013);
		c = new Invoice(4321, 3.52, 28, 2, 2014);
		d = new Invoice(1222, 3.53, 12, 9, 2015);
		e = new Invoice(2211, 3.54, 10, 10, 2016);
		f = new Invoice(1212, 3.55, 14, 12, 2017);
		g = new Invoice(2121, 3.56, 13, 11, 2017);
		a.display();
		b.display();
		c.display();
		d.display();
		e.display();
		f.display();
		g.display();
		
	}

}
