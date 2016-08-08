package mayank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class colorslider extends JFrame{

	private JSlider reds,blues,greens;
	private JLabel redl,bluel,greenl;
	private JPanel sliders,labels,colorpanel;
	public colorslider(){
		super("color changer");
		reds=new JSlider(JSlider.HORIZONTAL,0,200,0);
		blues=new JSlider(JSlider.HORIZONTAL,0,200,0);
		greens=new JSlider(JSlider.HORIZONTAL,0,200,0);
		redl=new JLabel("red=0");
		bluel=new JLabel("blue=0");
		greenl=new JLabel("green=0");
		colorpanel=new JPanel();
		colorpanel.setBackground(Color.BLACK);
		labels=new JPanel();
		sliders=new JPanel();
		Container pane=new Container();
		pane=this.getContentPane();
		pane.setLayout(new GridLayout(1,3,3,3));
		sliders.setLayout(new GridLayout(3, 1));
		sliders.add(reds);
		sliders.add(greens);
		sliders.add(blues);
		labels.setLayout(new GridLayout(3,1));
		labels.add(redl);
		labels.add(greenl);
		labels.add(bluel);
		
		reds.addChangeListener(
				
				new ChangeListener() {
					
					public void stateChanged(ChangeEvent e) {
						redl.setText(String.format("red=%d", reds.getValue()));
						colorpanel.setBackground( new Color(reds.getValue(),greens.getValue(),blues.getValue()));
					}
				}
				);
greens.addChangeListener(
				
				new ChangeListener() {
					
					public void stateChanged(ChangeEvent e) {
						greenl.setText(String.format("green=%d", greens.getValue()));
						colorpanel.setBackground( new Color(reds.getValue(),greens.getValue(),blues.getValue()));
					}
				}
				);
blues.addChangeListener(
		
		new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				bluel.setText(String.format("blue=%d", blues.getValue()));
				colorpanel.setBackground( new Color(reds.getValue(),greens.getValue(),blues.getValue()));
			}
		}
		);
		

pane.add(sliders);
pane.add(labels);
pane.add(colorpanel);

	}
	public static void main(String[] args) {

		colorslider ob=new colorslider();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setVisible(true);
		ob.setSize(300,200);

	}

}
