package mayank;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
import javax.swing.event.*;

public class random_no_game extends JFrame{

	private JTextField item;
	private JLabel item1;
	private JButton item2;
	private JLabel item3;
	private JLabel item4;  
	private int num;
	private int num1;
	random_no_game(){
		super("the title");
		setLayout(new FlowLayout());
		Random r=new Random();
		item1=new JLabel("enter your guess no.(1-10)--->");
		item= new JTextField(5);
		item2=new JButton("guess");
		item3=new JLabel();
		item4=new JLabel();
		item2.addActionListener(
				
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//line below to add sound
						Toolkit.getDefaultToolkit().beep();
						num1=(int)(r.nextInt(10)+1);
						try{
						item4.setText(String.format("random no. generated is:%d", num1));
						num=(int)(Integer.parseInt(item.getText()));
						if(num1==num)
							item3.setText("you won the game");
						else if(num1!=num)
							item3.setText("you failed!!");
						}
						catch(Exception ex){
							item4.setText("enter no. only");
						}
					}
				}
				);
	
	add(item1);
	add(item);
	add(item2);
	add(item4);
	add(item3);
	}
	
	public static void main(String[] args) {
		random_no_game ob=new random_no_game();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,200);

	}

}
