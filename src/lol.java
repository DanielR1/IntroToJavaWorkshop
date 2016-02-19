import javax.swing.JOptionPane;

public class lol {
	public static void main(String[] args) {
		String hi = JOptionPane.showInputDialog("What is my name?");
		if(hi.equals("Daniel")){
			JOptionPane.showMessageDialog(null, "Yay you know :D");
			
		}
		else if(hi.equals("daniel")){
			JOptionPane.showMessageDialog(null, "Yay you know :D");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wow ):");
		}
	}

}
