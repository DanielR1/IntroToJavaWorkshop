import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
		String name= JOptionPane.showInputDialog("What is your last name?");
		
		JOptionPane.showMessageDialog(null, "Hi Daniel "+name);
		JOptionPane.showMessageDialog(null, "(I know your first name because I am a stalker...)");
	}

}
