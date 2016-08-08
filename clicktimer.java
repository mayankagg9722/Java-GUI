package mayank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mayank.menubar.HelpWindow;

public class clicktimer extends JFrame{
	private JMenuBar menubar;
	private JMenu file,about;
	private JMenuItem restart,exit,help;
	private JLabel first,entertime,counter,result;
	private JTextField tf;
	private JButton st,cl;
	int count=0;
	int timecount;
	private Timer timer;
	clicktimer(){
		super("Click In Time Game");
		setLayout(new GridLayout(3,1));
		
		menubar=new JMenuBar();
		setJMenuBar(menubar);
		file=new JMenu("File");
		menubar.add(file);
		restart=new JMenuItem("Restart");
		exit=new JMenuItem("Exit");
		file.add(restart);
		file.add(exit);
		about=new JMenu("About");
		menubar.add(about);
		help=new JMenuItem("Help");
		about.add(help);
		
		restart r=new restart();
		restart.addActionListener(r);
		
		exit e=new exit();
		exit.addActionListener(e);
		
		helping h=new helping();
		help.addActionListener(h);
		
		Container pane=getContentPane();
		JPanel top=new JPanel();
		
		top.setLayout(new GridLayout(1,1));
		first=new JLabel("Enter time,pess Start,and press click repeatedly!!",SwingConstants.CENTER);
		top.add(first);
		pane.add(top);
		
		JPanel middle =new JPanel();
		middle.setLayout(new GridLayout(1, 3));
		entertime=new JLabel("Enter time->");
		tf=new JTextField(10);
		tf.selectAll();
		st=new JButton("START");
		middle.add(entertime);
		middle.add(tf);
		middle.add(st);
		pane.add(middle);
		
		JPanel bottom=new JPanel();
		bottom.setLayout(new GridLayout(1, 3));
		counter=new JLabel("Counts:0");
		result=new JLabel("Time:0");
		cl=new JButton("Click");
		cl.setEnabled(false);
		bottom.add(cl);
		bottom.add(counter);
		bottom.add(result);
		pane.add(bottom);
		
		event ev =new event();
		st.addActionListener(ev);
	}
	public class event implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			try{
				timecount=(int)(Integer.parseInt(tf.getText()));
				timer=new Timer(1000,null);
				timer.start();
				cl.setEnabled(true);
				st.setEnabled(false);
				result.setText("Time:"+timecount);
				timer.addActionListener(
						
						new ActionListener(){
							
							public void actionPerformed(ActionEvent e) {
								timecount--;
								if(timecount>=1){
									result.setText("Time:"+timecount);
									
								}
								else if(timecount<1){
									timer.stop();
									result.setText("Times Up!!");
									cl.setEnabled(false);
								}
							}	
						}
						);
				cl.addActionListener(
						new ActionListener() {
							
							public void actionPerformed(ActionEvent e) {
							
								count++;
								counter.setText("Counts:"+count);
							}
						}
						
						);
				}
			catch(NumberFormatException n){
				tf.selectAll();
				tf.setText("Enter no.s only");
				
			}
				
		}
	}
	
	
	public class helping implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				 helpwindow obj=new helpwindow(clicktimer.this);
				 obj.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				 obj.setSize(500,100);
				 obj.setResizable(false);
				 obj.setVisible(true);
		}
		
	}
	public class helpwindow extends JDialog{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JLabel lab;
		helpwindow(JFrame framing){
			super(framing,"About The Game",true);
			lab=new JLabel();
			lab.setText("Set the timer and click as much as you can before timer stops!!");
			add(lab);
		}
	}
	
	public class exit implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.exit(0);	
		}
		
	}
	
	public class restart implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			urgent ob1=new urgent(clicktimer.this);
			ob1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			ob1.setSize(300,100);
			ob1.setResizable(false);
			ob1.setVisible(true);
		}
	}

	public class urgent extends JDialog{
		 JLabel lab;
		 JButton ok,cancel;
		public urgent(JFrame frame){
			super(frame,"THINK ONCE!!",true);
			getToolkit().beep();
			setLayout(new FlowLayout());
			lab=new JLabel("Are you sure to restart!!");
			add(lab);
			ok=new JButton("Ok");
			cancel=new JButton("Cancel");
			add(ok);
			add(cancel);
			ok.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e) {
							st.setEnabled(true);
							cl.setEnabled(false);
							counter.setText("Counts:0");
							result.setText("Time:0");
							tf.setText("");
							dispose();
						}
						
					}
					);
			cancel.addActionListener(
					new ActionListener(){

						public void actionPerformed(ActionEvent e) {
							dispose();
						}
						
					}
					);
		}

	}
	public static void main(String[] args) {
		
		clicktimer ob=new clicktimer();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(500,200);

	}	
	
}
