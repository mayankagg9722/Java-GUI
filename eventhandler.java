package mayank;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class eventhandler extends JFrame {
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField item4;
	
	eventhandler(){
		super("the title bar");
		setLayout(new FlowLayout());
		item1=new JTextField(10);
		add(item1);
		
		item2=new JTextField("Enter text");
		item2.select(0, 10);
		add(item2);
		
		item3=new  JTextField("uneditable",20);
		item3.setEditable(false);
		add(item3);
		
		item4=new JPasswordField("mayank");
		add(item4);
		
		thehandler handler=new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		item4.addActionListener(handler);
		
	}
	private class thehandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String str="";
			if(event.getSource()==item1)
				str=str.format("field1:%s", event.getActionCommand());
			else if(event.getSource()==item2)
				str=str.format("field2:%s", event.getActionCommand());
			else if(event.getSource()==item3)
				str=str.format("field3:%s", event.getActionCommand());
			else if(event.getSource()==item4)
				str=str.format("field4:%s", event.getActionCommand());
		JOptionPane.showMessageDialog(null, str);	
		}
	}
	public static void main(String[] args) {
		eventhandler ob=new eventhandler();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setSize(350,100);
		ob.setVisible(true);
	}

}
