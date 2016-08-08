package mayank;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
public class multislist extends JFrame {

	private JList leftlist;
	private JButton mb;
	private JList rightlist;
	private static String[] food={"beef","beacon","mushroom","ham","wings"};
	
	public multislist(){
		
		super("the title");
		setLayout(new FlowLayout());
		leftlist=new JList(food);
		leftlist.setVisibleRowCount(2);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		mb=new JButton("move -->");
		mb.addActionListener(
				new ActionListener(){
					
					public void actionPerformed(ActionEvent event) {
						rightlist.setListData(leftlist.getSelectedValues());
					}
					
				}
	  );
		
		add(mb);
		rightlist=new JList();
		rightlist.setVisibleRowCount(2);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(30);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	
	}
	
	public static void main(String[] args) {
		multislist ob=new multislist();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,300);		

	}

}
