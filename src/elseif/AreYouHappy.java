package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever youre doing.");
		}
		if (answer.equals("no")) {
			JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever youre doing.");}
			else {
				JOptionPane.showMessageDialog(null, "Change something");
			}
		}

	}
}
