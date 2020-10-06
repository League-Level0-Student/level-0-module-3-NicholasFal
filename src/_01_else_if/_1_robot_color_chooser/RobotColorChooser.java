
package _01_else_if._1_robot_color_chooser;
import java.util.Random;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot robot = new Robot();
		// 2. Make the robot draw a shape (this will take more than one line of code)
		
		// 3. Set the pen width to 10
		robot.setPenWidth(10);
		// 4. Ask the user what color pen they would like the robot to draw with
		for(int infinite = 1; infinite > 0; infinite++) {
		String penColor = JOptionPane.showInputDialog("What color pen would you like the robot to draw with?");
		// 5. Use an if/else statement to set the pen color that the user requested
		if (penColor.equalsIgnoreCase("red")) {
			robot.setPenColor(Color.red);
		} else if (penColor.equalsIgnoreCase("orange")) {
			robot.setPenColor(Color.ORANGE);
		} else if (penColor.equalsIgnoreCase("yellow")) {
			robot.setPenColor(Color.YELLOW);
		} else if (penColor.equalsIgnoreCase("green")) {
			robot.setPenColor(Color.green);
		} else if (penColor.equalsIgnoreCase("blue")) {
			robot.setPenColor(Color.blue);
		} else if (penColor.equalsIgnoreCase("purple")) {
			robot.setPenColor(153, 0 , 255);
		} else if (penColor.equalsIgnoreCase("pink")) {
			robot.setPenColor(Color.pink);
		} else if (penColor.equalsIgnoreCase("black")) {
			robot.setPenColor(Color.black);
		} else {
			robot.setRandomPenColor();
		}
		for(int sides = 0; sides < 4; sides++) {
			robot.setSpeed(6);
			robot.penDown();
			robot.move(100);
			robot.turn(90);
		}
		}
		}
	
	
	// 6. If the user doesn't enter anything, choose a random color
	// 7. Put a loop around your code so that you keep asking the user for more
	// colors & drawing them

}
