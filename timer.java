package mayank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.tools.Tool;
public class timer extends JFrame {
	private JButton bt;
	private JTextField tf;
	private JLabel first,second;
	private Timer timer;
	int counter;
	timer(){
		super("the title");
		setLayout(new GridLayout(2,2));
		first=new JLabel("Enter Seconds:");
		add(first,SwingConstants.CENTER);
		tf=new JTextField(5);
		add(tf);
		bt=new JButton("PRESS TO START");
		add(bt);
		second=new JLabel("Waiting..");
		add(second);
		//1000 is in milliseconds
		timer=new Timer(1000, null);
		bt.addActionListener(
				new ActionListener(){

					public void actionPerformed(ActionEvent e) {
						counter=(int)(Integer.parseInt(tf.getText()));
						second.setText("Time Left:"+counter);
						timer.start();
						timer.addActionListener(
								new ActionListener(){

									public void actionPerformed(ActionEvent e) {
										counter--;
										if(counter>=1)
										second.setText("Time Left:"+counter);
										else{
											getToolkit().beep();
											timer.stop();
											second.setText("Times Up!!");
										}
											
									}
									
								}
								
								);
						
					}
					
				}
				);
	}
	public static void main(String[] args) {
		timer ob=new timer();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setSize(300,100);
		ob.setVisible(true);
	}

}
