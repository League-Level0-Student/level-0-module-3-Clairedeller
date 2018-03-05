
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "September 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String name =JOptionPane.showInputDialog(null, "Who are you?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, name);
		// 4. if user asked for "mom"
		if (name.equals("mom")) { JOptionPane.showMessageDialog(null, momsBirthday);}
		
			//print mom's birthday
		// 5. if user asked for "dad"
		if (name.equals("dad")) { JOptionPane.showMessageDialog(null, dadsBirthday);}
			// print dad's birthday
		// 6. if user asked for your name
		if (name.equals("claire")) { JOptionPane.showMessageDialog(null, myBirthday);}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {JOptionPane.showMessageDialog(null, "I dont remember");
	} 
	}}
