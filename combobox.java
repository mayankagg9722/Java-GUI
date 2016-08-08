package mayank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class combobox extends JFrame {

	private JLabel picture;
	private JComboBox box;
	private static String[] filename={"b.png","x.png"};
	private  Icon[] pics={new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};
	
	public combobox(){
		
		super("the title bar");
		setLayout(new FlowLayout());
		box=new JComboBox (filename);
		box.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
					if(event.getStateChange()==ItemEvent.SELECTED)	
						picture.setIcon(pics[box.getSelectedIndex()]);
					}
				}
		);
	add(box);
	picture=new JLabel(pics[0]);
	add(picture);
	}
	
	
	public static void main(String[] args) {
		combobox ob=new combobox();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,300);
	}

}