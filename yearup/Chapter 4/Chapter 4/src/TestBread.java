
public class TestBread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bread rye = new Bread("rye", 10);
		Bread white = new Bread("white", 15);
		Bread wholeGrain = new Bread("whole grain", 30);
		
		System.out.println(rye.MOTTO + "\n" + rye.getBreadType() + " " + rye.getCaloriesPerSlice() + "\n\n" + 
		white.MOTTO + "\n" + white.getBreadType() + " " + white.getCaloriesPerSlice() + "\n\n" + wholeGrain.MOTTO + "\n" + 
				wholeGrain.getBreadType() + " " + wholeGrain.getCaloriesPerSlice());
	}

}
