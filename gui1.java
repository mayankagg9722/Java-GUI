package mayank;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class gui1 extends JFrame {
	private JLabel item1;
	gui1(){
		super("The Title Bar");
		setLayout(new FlowLayout());
		item1=new JLabel("this is a sentence");
		item1.setToolTipText("text when mouse is over it!!");
		add(item1);
	}
	public static void main(String[] args) {
		gui1 ob=new gui1();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setSize(275,180);
		ob.setVisible(true);
	}

}
