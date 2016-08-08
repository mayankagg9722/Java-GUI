package mayank;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class radiob extends JFrame {

	private TextField tf;
	private Font pf;
	private Font bf;
	private Font iif;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup gb;
	
	public radiob(){
		super("Change font box");
		setLayout(new FlowLayout());
		
		tf=new TextField("Food is Soo Good!!",14);
		add(tf);

		pb=new JRadioButton("plain");
		bb=new JRadioButton("bold");
		ib=new JRadioButton("italic");
		bib=new JRadioButton("bold&italic");
		add(pb);
		add(bb);
		add(bib);
		add(ib);
		
		gb=new ButtonGroup();
		gb.add(pb);
		gb.add(ib);
		gb.add(bib);
		gb.add(bb);
		
		pf=new Font("serif",Font.PLAIN,14);
		bf=new Font("serif",Font.BOLD,14);
		iif=new Font("serif",Font.ITALIC,14);
		bif=new Font("serif",Font.ITALIC+Font.BOLD,14);
		tf.setFont(pf);
		
		pb.addItemListener(new handlerclass(pf));
		bb.addItemListener(new handlerclass(bf));
		bib.addItemListener(new handlerclass(bif));
		ib.addItemListener(new handlerclass(iif));
	}
	
	public class handlerclass implements ItemListener{
		Font font;
		public handlerclass(Font f){
			font=f;
		}
		public void itemStateChanged(ItemEvent e) {
			tf.setFont(font);
		}
		
	}
	public static void main(String[] args) {

		radiob ob=new radiob();
		ob.setVisible(true);
		ob.setSize(300,200);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}