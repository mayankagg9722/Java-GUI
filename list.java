package mayank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class list extends JFrame{

	private JList list;
	private String[] color={"white","black","red","green"};
	private Color[] background={Color.WHITE,Color.BLACK,Color.RED,Color.GREEN};
	list(){
		super("the title");
		setLayout(new FlowLayout());
		list=new JList(color);
		list.setVisibleRowCount(2);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			add(new JScrollPane(list));
			list.addListSelectionListener(
					new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent e) {
							getContentPane().setBackground(background[list.getSelectedIndex()]);
						}
					}			
			);
	}
	public static void main(String[] args) {
		list ob=new list();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,300);

	}

}
