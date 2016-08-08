package mayank;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class menubar extends JFrame{

	private JMenuBar menubar;
	private JMenu help;
	JMenuItem about;
	
	menubar(){
		super("the title");
		setLayout(new FlowLayout());
		menubar=new JMenuBar();
		add(menubar);
		help=new JMenu("Help");
		menubar.add(help);
		about=new JMenuItem("About");
		help.add(about);
		setJMenuBar(menubar);
		about.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						HelpWindow ob1=new HelpWindow(menubar.this);
						ob1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
						ob1.setSize(300,100);
						ob1.setVisible(true);
					}
				}
				);
		}
	public class HelpWindow extends JDialog{
		JLabel label;
		public HelpWindow(JFrame frame){
			super(frame, "Help window",true);
			setLayout(new FlowLayout());
			label=new JLabel("I am tired thi is help menu");
			add(label);
		}
	}
	public static void main(String[] args) {
		menubar ob=new menubar();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,200);


	}

}
