package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer =JOptionPane.showInputDialog("what month of the year has 28 days?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equalsIgnoreCase("all of them")) {
score+=5;
	JOptionPane.showMessageDialog(null, "Yay,  you were right! Your score is "+score+".");	
}
else {
	score-=3;
	JOptionPane.showMessageDialog(null, "You were wrong!");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String answer1 =JOptionPane.showInputDialog("There is a boat filled with people, but there isn't a single person on board. How is this true?");
if (answer1.equalsIgnoreCase("everyone onboard is married")) {
score+=5;
	JOptionPane.showMessageDialog(null, "Yay,  you were right! Your score is "+score+".");	
}
else {
	score-=3;
	JOptionPane.showMessageDialog(null, "You were wrong!");
String answer2 =JOptionPane.showInputDialog("What does man love more than life, hate more than death or mortal strife; that which contented men desire; the poor have, the rich require; the miser spends, the spendthrift saves, and all men carry to their graves?");
if (answer2.equalsIgnoreCase("nothing")) {
score+=5;
JOptionPane.showMessageDialog(null, "Yay,  you were right! Your score is "+score+".");	
}
else {
score-=3;
JOptionPane.showMessageDialog(null, "You were wrong!");
}
		// 2. Make a pop up to show the score.
		
	}
}}

