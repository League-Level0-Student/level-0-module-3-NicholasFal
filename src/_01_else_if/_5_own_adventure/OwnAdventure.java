package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		JOptionPane.showMessageDialog(null, "Once upon a time, you are swimming in an ocean filled with dolphins. You see an ice cream truck pulls up near the dock.");
				 String questionOne = JOptionPane.showInputDialog("Do you go get an ice cream, or continue swimming with the dolphins? (Ice cream/dolphins)");
	if(questionOne.equalsIgnoreCase("dolphins")) {
		JOptionPane.showMessageDialog(null, "You decided to keep swimming with the dolphins, a few minutes later you look underwater and find a shark is coming right for you! ");
		String questionTwo = JOptionPane.showInputDialog("Do you swim away from it, scream in hopes someone hears you, or just stare at the shark? (Swim/scream/stare)");
		if(questionTwo.equalsIgnoreCase("scream")) {
			JOptionPane.showMessageDialog(null, "You scream, and all that does is make the shark charge faster at you, you die a bloody and painful death. The end!");
		} else if(questionTwo.equalsIgnoreCase("swim")){
			JOptionPane.showMessageDialog(null, "Though running added a few seconds to your life, there was no outrunning that shark. You die a bloddy and painful death, the end!");
		} else {
			JOptionPane.showMessageDialog(null, "You stare at the shark, and swim slowly to the dock while looking at him. The shark turns slightly and swims parallel to the shore.");
			String questionThree = JOptionPane.showInputDialog("You safely make it to the dock, however the shark starts attacking someone else, what do you do? (Stay/help)");
		if(questionThree.equalsIgnoreCase("Stay")) {
			JOptionPane.showMessageDialog(null, "You decide to let the boy die to the shark, and you go help yourself to the ice cream truck. Someone else ends up saving the boy and they get a cash reward of $15,000." 
					+ "\n You end up feeling horrible about not helping the boy, and thinking about that for the rest of your life. The end!");
		}else {
			JOptionPane.showMessageDialog(null, "You go and save the boy. You tie a rope to an inflatable tube, and throw the tube onto his head. You yank the rope and the shark turns away." 
					+ "\n Not only did you save the boy, but his family gave you $15,000 in cash as a thank you. The end!");
		}
		}
	} else if(questionOne.equalsIgnoreCase("ice cream")) {
		JOptionPane.showMessageDialog(null, "You go get an ice cream cone, and sit down on a bench that faces the ocean. The sun starts to set as you finish your ice cream cone, it was a beautiful sight.");
				String questionFour = JOptionPane.showInputDialog("It soon starts to get real dark, and when you get up to go to your car, you find you can't! You're paralized, you then start to cough, and you feel horrible. You then see "
						+"\nthe guy who sold you the ice cream cone giggle and run away, and since it's so late, no one is there to help you. Do you beg the guy for help, or try to get up? (beg/up)");
				if(questionFour.equalsIgnoreCase("beg")) {
				JOptionPane.showMessageDialog(null, "You beg him to help you, but he runs away with an evil grin on his face and some undeserving money. "
						+ "\n However, someone hears you, and comes to help you. He gets you to a hospital safely, and you then continue to live your life. The end!");
				} else if(questionFour.equalsIgnoreCase("up")) {
					JOptionPane.showMessageDialog(null, "You attempt to get up from your chair, but you find after trying to move your leg, you feel a splitting pain, and die a painful death. The end!");
				}
	}
	}

}
