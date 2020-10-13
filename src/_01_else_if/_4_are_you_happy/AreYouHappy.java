package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String happy = JOptionPane.showInputDialog(null, "Are you happy?");
		if(happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
		} else {
			String happyWant = JOptionPane.showInputDialog("Do you want to be happy?");
			if(happyWant.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
			}
		}
		
	}

}
