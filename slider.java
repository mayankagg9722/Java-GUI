package mayank;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class slider extends JFrame {
     
	private JLabel item;
	private JSlider item1;
	private JTextField tf;
	slider(){
		super("the title");
		setLayout(new FlowLayout());
		tf=new JTextField("food is doo good!!",10);
		tf.setSize(50,30);
		item1=new JSlider(JSlider.HORIZONTAL,0,20,10);
		item1.setMajorTickSpacing(5);
		item1.setPaintTicks(true);
		item=new JLabel("curr value is 0");
		item1.addChangeListener(
				
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
					Font font=new Font("serif",Font.PLAIN,item1.getValue());
					item.setText(String.format("your value is:%d", item1.getValue()));
					tf.setSize(50, 30);
					tf.setFont(font);
					
					}
				}
				
				);
		add(tf);
		add(item1);
		add(item);
	}
	

	public static void main(String[] args) {
		slider ob=new slider();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,200);

	}

}
