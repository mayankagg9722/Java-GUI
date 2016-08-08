package mayank;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class layout extends JFrame {
	private JButton lb;
	private JButton rb;
	private JButton cb;
	private FlowLayout layout;
	private Container container;
	public layout(){
		super("the title");
		layout=new FlowLayout();
		setLayout(layout);
		container=getContentPane();
		lb=new JButton("left");
		lb.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
				
				);
		add(lb);
		cb=new JButton("center");
		cb.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
				
				);
		add(cb);
		rb=new JButton("right");
		rb.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
				
				);
		add(rb);
			
	}
	
	public static void main(String[] args) {
		layout ob=new layout();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,200);		

	}

}
