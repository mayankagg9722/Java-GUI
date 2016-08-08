package mayank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class highlowgame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menubar;
	private JMenu file;
	private JMenuItem restart,exit;
	private JLabel rand1,rand2,rand3,rand4,or,wl;
	private JButton high,low;
	public Container pane;
	int r1,r2,r3,r4;
	int round=1;
	public highlowgame(){
		super("HIGH LOW NO. GAME");
		setLayout(new GridLayout(3, 1));
		
		menubar=new JMenuBar();
		setJMenuBar(menubar);
		file=new JMenu("File");
		menubar.add(file);
		restart=new JMenuItem("restart");
		exit=new JMenuItem("exit");
		file.add(restart);
		file.add(exit);
		
		restart r=new restart();
		restart.addActionListener(r);
		
		exit e=new exit();
		exit.addActionListener(e);
	
		pane=getContentPane();
		
		r1=(int)(Math.random()*20+1);
		
		rand1=new JLabel(""+r1,SwingConstants.CENTER);
		rand2=new JLabel("");
		rand3=new JLabel("");
		rand4=new JLabel("");
		or=new JLabel("or",SwingConstants.CENTER);
		wl=new JLabel("Let's Start!!",SwingConstants.CENTER);
		high=new JButton("HIGHER");
		low=new JButton("LOWER");
		high.setToolTipText("click if you expect higher numer");
		low.setToolTipText("click if you expect lower number");
		event ev=new event();
		high.addActionListener(ev);
		low.addActionListener(ev);
		
		JPanel top=new JPanel();
		top.setLayout(new GridLayout(1,4));
		top.add(rand1);
		top.add(rand2);
		top.add(rand3);
		top.add(rand4);
		
		JPanel middle=new JPanel();
		middle.setLayout(new GridLayout(1, 3));
		middle.add(high);
		middle.add(or);
		middle.add(low);
		
		JPanel bottom=new JPanel();
		bottom.setLayout(new GridLayout(1, 1));
		bottom.add(wl);
		
		pane.add(top);
		pane.add(middle);
		pane.add(bottom);
	
	}

	public class event implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String option=e.getActionCommand();
				
			if(round==1){
					r2=(int)(Math.random()*20+1);
					rand2.setText(""+r2);
					if(r2>r1 && option.equals("HIGHER")){
						wl.setText("2 more to go!!");
					}
					else if(r2<r1 && option.equals("LOWER")){
						wl.setText("2 more to go!!");
					}
					else if(r2>r1 && option.equals("LOWER")){
						wl.setText("You Lost The Game!!");
						high.setEnabled(false);
						low.setEnabled(false);
					}
					else if(r2<r1 && option.equals("HIGHER")){
						wl.setText("You Lost The Game!!");
						high.setEnabled(false);
						low.setEnabled(false);
					}
					round=2;
				}
				else if(round==2){
					r3=(int)(Math.random()*20+1);
					rand3.setText(""+r3);
					if(r3>r2 && option.equals("HIGHER")){
						wl.setText("1 more to go!!");
					}
					else if(r3<r2 && option.equals("LOWER")){
						wl.setText("1 more to go!!");
					}
					else if(r3>r2 && option.equals("LOWER")){
						wl.setText("You Lost The Game!!");
						high.setEnabled(false);
						low.setEnabled(false);
					}
					else if(r3<r2 && option.equals("HIGHER")){
						wl.setText("You Lost The Game!!");
						high.setEnabled(false);
						low.setEnabled(false);
					}
					round=3;
				}
				else if(round==3){
					r4=(int)(Math.random()*20+1);
					rand4.setText(""+r4);
					if(r4>r3 && option.equals("HIGHER")){
						wl.setText("You Won The Game!!");
						high.setEnabled(false);
						low.setEnabled(false);
					}
					else if(r4<r3 && option.equals("LOWER")){
						wl.setText("You Won The Game!!");
						high.setEnabled(false);
						low.setEnabled(false);
					}
					else if(r4>r3 && option.equals("LOWER")){
						wl.setText("You Lost The Game!!");
						high.setEnabled(false);
						low.setEnabled(false);
					}
					else if(r4<r3 && option.equals("HIGHER")){
						wl.setText("You Lost The Game!!");
						high.setEnabled(false);
						low.setEnabled(false);
					}
					round=4;
				}
		}
		
	}
	
	public class exit implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.exit(0);	
		}
		
	}
	
	public class restart implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			urgentwindow ob1=new urgentwindow(highlowgame.this);
			ob1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			ob1.setSize(300,100);
			ob1.setVisible(true);
		}
	}

	public class urgentwindow extends JDialog{
		 JLabel lab;
		 JButton ok,cancel;
		public urgentwindow(JFrame frame){
			super(frame,"THINK ONCE!!",true);
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
							
							r1=(int)Math.random()*20+1;
							round=1;
							rand1.setText(""+r1);
							rand2.setText("");
							rand3.setText("");
							rand4.setText("");
							wl.setText("");
							high.setEnabled(true);
							low.setEnabled(true);
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
		
		highlowgame ob=new highlowgame();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(500,200);

	}

}
