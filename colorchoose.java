package mayank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class colorchoose extends JFrame{

	private JButton b;
	private JPanel panel;
	private Color color=(Color.WHITE);
	public colorchoose(){
		super("the title");
		panel=new JPanel();
		panel.setBackground(Color.WHITE);
		b=new JButton("color chooser");
		b.addActionListener(
				new ActionListener() {
					
					
					public void actionPerformed(ActionEvent e) {
						color=JColorChooser.showDialog(null, "pick your color", color);
						if(color==null)
							color=color.WHITE;
						panel.setBackground(color);
					}
				}
				);
	add(panel,BorderLayout.CENTER);
	add(b,BorderLayout.SOUTH);
	}	
	public static void main(String[] args) {
		colorchoose ob=new colorchoose();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,200);		

	}
}