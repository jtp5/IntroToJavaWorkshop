package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		String adress = JOptionPane.showInputDialog("What is your adress?");
		JOptionPane.showMessageDialog(null, "Hi " + name + " " + "You have been fooled. I now know your adress. It is : " + adress);
		JOptionPane.showMessageDialog(null, "get rekt n3rd.");
	}
}
