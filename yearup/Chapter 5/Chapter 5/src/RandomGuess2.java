import javax.swing.*;
public class RandomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random, user;
		String some;
		random = (1 + ((int)(Math.random()* 10)));
		some = JOptionPane.showInputDialog(null,"Enter an integer");
		user = Integer.parseInt(some);
		if(user == random)
			JOptionPane.showMessageDialog(null, "Correct Guess");
		else
			if(user <= random)
				JOptionPane.showMessageDialog(null, "Too Low");
			else
				JOptionPane.showMessageDialog(null, "Too High");
	}

}
