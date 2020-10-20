package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class YearsAlive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String preAge = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(preAge);
		String bday = JOptionPane.showInputDialog("Have you had your birthday this year? (yes/no)");
		int year = 2020;
		year = year - age;
		if(bday.equalsIgnoreCase("no")) {
			year = year - 1;
		}
		
		for( ; year < 2021; year++) {
			System.out.println(year);
		}
	}

}
