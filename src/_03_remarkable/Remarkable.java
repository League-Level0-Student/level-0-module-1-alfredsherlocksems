package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Colt = ("You know loads about things such as ships and it's unbelievably amazing! :)");
	String Rudy = ("You are a boss at dragon fight!");	
String Walter =   ("Your a nice guy!");









// 2. Ask the user to enter a name. Store their answer in a variable.
String Bob = JOptionPane.showInputDialog("What is your first name?");








// 3. In a pop-up, tell the user what is remarkable about that person. 

	if(Bob.equals("Colt")) {
JOptionPane.showMessageDialog(null, Colt);
	}
if(Bob.equals("Rudy")) {
JOptionPane.showMessageDialog(null, Rudy);
}
if(Bob.equals("Walter")) {
	JOptionPane.showMessageDialog(null, Walter);
}


























}
}

