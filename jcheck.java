package mayank;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class jcheck extends JFrame{
	private JTextField item1;
	private JCheckBox item2;
	private JCheckBox item3;
	jcheck(){
		super("the title bar");
		setLayout(new FlowLayout());
		item1=new JTextField("Food is soo good!!",25);
		item1.setFont(new Font("serif",Font.PLAIN,14));
		item2=new JCheckBox("bold");
		item2.setToolTipText("for making text bold");
		item3=new JCheckBox("itlaic");
		item3.setToolTipText("for making text italic");
		add(item1);
		add(item2);
		add(item3);
		handlerclass handler=new handlerclass();
		item2.addItemListener(handler);
		item3.addItemListener(handler);
}
	public class handlerclass implements ItemListener{
		public void itemStateChanged(ItemEvent event){
		Font font=null;
		if(item2.isSelected()&&item3.isSelected())
			font=new Font("serif",Font.BOLD+Font.ITALIC,14);
		else if(item2.isSelected())
			font=new Font("serif",Font.BOLD,14);
		else if(item3.isSelected())
			font=new Font("serif",Font.ITALIC,14);
		else
			font=new Font("serif",Font.PLAIN,14);
		item1.setFont(font);
		}
	}
	public static void main(String[] args) {
		jcheck ob=new jcheck();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(350,350);
	}
}