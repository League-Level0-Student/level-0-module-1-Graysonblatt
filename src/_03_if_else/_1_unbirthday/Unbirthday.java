package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String answer =JOptionPane.showInputDialog("When is you're birthday?(MM/DD)");	
if (answer.equalsIgnoreCase ("05/06")) {
	JOptionPane.showMessageDialog(null, "Happy birthday! Wooo!");
}	
else   {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday. woo.");
	}

}
}
