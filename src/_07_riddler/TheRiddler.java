package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String q1 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (q1.contentEquals("A coin")) {
	JOptionPane.showMessageDialog(null, "Correct!");
score++;
	}
	// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong! I excpected better! The answer was a coin!");	
score--;
}	// 6. Add some more riddles
String q2 = JOptionPane.showInputDialog("During which month do people sleep the least?");
	
if (q2.equals("Febuary")) {
JOptionPane.showMessageDialog(null, "Correct! What a job!");
score++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong! So close! The answer was Febuary! (because there are fewer days in Febuary!");
score--;
}












// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	
}}

