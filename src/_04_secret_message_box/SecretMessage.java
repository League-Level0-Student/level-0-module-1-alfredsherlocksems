package _04_secret_message_box;

import javax.swing.JOptionPane;

public class SecretMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String Password = "And I oop";
String sum =	JOptionPane.showInputDialog("Type in a secret message!");
	String q1 = JOptionPane.showInputDialog("Do you want to see a secret message? See if you can type the right password... if you dare!!!!!");
	if(q1.equals(Password)) {
	JOptionPane.showMessageDialog(null, "You got it right! Here is the password:" + sum);
	}
	else {
		JOptionPane.showMessageDialog(null, "INTRUDER");
	}
	}}



