
public class State {
	
	private String stateName;
	private int statePop;
	private City cap, pop;
	
	public State(String sn, int sp, String capcn, int capcp, String popcn, int popcp) {
		stateName = sn;
		statePop = sp;
		cap = new City(capcn, capcp);
		pop = new City(popcn, popcp);
	}
	
	public String getStateName() {
		
		return stateName;
	}
	
	public int getStatePop() {
		
		return statePop;
	}
	
	private static class City {
		
		private String cityName;
		private int cityPop;
		
		public City(String x, int y) {
			cityName = x;
			cityPop = y;
		}
		
		public String getCityName() {
			
			return cityName;
		}
		
		public int getCityPop() {
			
			return cityPop;
		}
	}
	
	public void displayStateInfo() {
		
		System.out.println(stateName + " has a population of " + statePop + " people and its capital, " + cap.getCityName() + 
				" has a population of " + cap.getCityPop() + " people.\n" + stateName + "'s most populous city is " + pop.getCityName() + " with a population of " +
				pop.getCityPop() + " people.");
	}
}
