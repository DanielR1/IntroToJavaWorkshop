import javax.swing.JOptionPane;

public class creeper {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Fill in this info for a free iPhone 6s!");
		String lol1= JOptionPane.showInputDialog("How old are you?");
		String lol2= JOptionPane.showInputDialog("What is your address?");
		String lol3= JOptionPane.showInputDialog("What is your phone number?");
		String lol4= JOptionPane.showInputDialog("What is your full name?");
		String lol5= JOptionPane.showInputDialog("What is your credit card number?");
		String lol6= JOptionPane.showInputDialog("What is your credit card security code?");
		JOptionPane.showMessageDialog(null, "Thank you");
		JOptionPane.showMessageDialog(null, "I now know that:");
		JOptionPane.showMessageDialog(null, "You are "+ lol1);
		JOptionPane.showMessageDialog(null, "Your address is "+ lol2);
		JOptionPane.showMessageDialog(null, "Your phone number is "+ lol3);
		JOptionPane.showMessageDialog(null, "Your name is "+ lol4);
		JOptionPane.showMessageDialog(null, "and that Your credit card number is "+ lol5+ " And your security code is "+ lol6);
		JOptionPane.showMessageDialog(null, "You will now be robbed");
		JOptionPane.showMessageDialog(null, "And no free iPhone for you :D");
	}

}
