package mayank;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class mouse extends JFrame {
private JLabel statusbar;
private JPanel mousepanel;
public mouse(){
	super("the title");
	mousepanel=new JPanel();
	mousepanel.setBackground(Color.WHITE);
	add(mousepanel,BorderLayout.CENTER);
	statusbar=new JLabel("default");
	add(statusbar,BorderLayout.SOUTH);
	handlerclass handler=new handlerclass();
	mousepanel.addMouseListener(handler);
	mousepanel.addMouseMotionListener(handler);	
}
public class handlerclass implements MouseListener,MouseMotionListener{
	
	public void mouseDragged(MouseEvent e) {
		
		statusbar.setText("you dragged the mouse");
	}
	public void mouseMoved(MouseEvent e) {
		statusbar.setText("you moved the mouse");
		
	}
	public void mouseClicked(MouseEvent e) {
		statusbar.setText(String.format("you clicked at %d,%d",e.getX(),e.getY()));
	}
	public void mousePressed(MouseEvent e) {
		statusbar.setText("you pressed the mouse");
		
	}
	public void mouseReleased(MouseEvent e) {
		statusbar.setText("you released the mouse"); 
		
	}
	public void mouseEntered(MouseEvent e) {
		statusbar.setText("you entered the area");
		mousepanel.setBackground(Color.RED);
		
	}

	public void mouseExited(MouseEvent e) {
		statusbar.setText("you exited the area");
		mousepanel.setBackground(Color.GREEN);
		
	}

	}
	
public static void main(String[] args) {
	mouse ob=new mouse();
	ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ob.setVisible(true);
	ob.setSize(300,200);		

	}




}