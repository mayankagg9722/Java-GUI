package mayank;
import java.awt.*;
import javax.swing.*;
import javax.xml.bind.Marshaller.Listener;
import java.awt.event.*;
public class jbutton extends JFrame {
private JButton item1;
public jbutton(){
super("the title");
setLayout(new FlowLayout());
item1=new JButton("item1 button");
item1.setToolTipText("mouse when over it!!");
add(item1);

handler thehandle=new handler();
item1.addActionListener(thehandle);
}
public class handler implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showConfirmDialog(null,String.format("%s", e.getActionCommand()));
		
	}
	
	
}
	public static void main(String[] args) {
	
		jbutton ob=new jbutton();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setSize(350,250);
		ob.setVisible(true);

	}

}
