import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ran1, ran2, ran3, user1, user2, user3, match = 0, payout = 0;
		ran1 = (int)(Math.random()*10);
		ran2 = (int)(Math.random()*10);
		ran3 = (int)(Math.random()*10);
		
		System.out.println("Guess three numbers: ");
		user1 = input.nextInt();
		user2 = input.nextInt();
		user3 = input.nextInt();
		
		if(user1 == ran1 || user2 == ran1 || user3 == ran1)
			match = match + 1;
			
		if(user1 == ran2 || user2 == ran2 || user3 == ran3)
			match = match + 1;
		
		if(user1 == ran3 || user2 == ran3 || user3 == ran3)
			match = match + 1;
		
		switch(match) {
		case 0:
			payout = 0;
			break;
		case 1:
			payout = 10;
			break;
		case 2:
			payout = 100;
			break;
		case 3:
			if(user1 == ran1 && user2 == ran2 && user3 == ran3)
				payout = 1000000;
			else
				payout = 1000;
		}
		
		System.out.println("Your guess: " + user1 + "," + user2 + "," + user3 + "\nRandom Roll: " + ran1 + "," + ran2 + "," + ran3);
		System.out.println("Your payout: $" + payout);
	}

}
