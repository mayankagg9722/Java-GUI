package mayank;
import javax.swing.JOptionPane;
public class gui {

	public static void main(String[] args) {
		String fn=JOptionPane.showInputDialog("Enter first No.");
		String sn=JOptionPane.showInputDialog("Enter second No.");
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		int sum=num1+num2;
		JOptionPane.showConfirmDialog(null, "The sum is: "+sum, "ANSWER",JOptionPane.PLAIN_MESSAGE);
	}

}
