import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvents2 extends Applet implements MouseListener, MouseMotionListener {
	int x=0,y=0;
	String msg;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void mouseEntered(MouseEvent e)
	{
		x =0;
		y = 10;
		msg = " Mouse Entered";
		setBackground(Color.cyan);
		repaint();
	}
	
	public void mouseExited(MouseEvent e)
	{
		x =0;
		y = 10;
		msg = " Mouse Exited";
		setBackground(Color.BLUE);
		repaint();
	}
	
	public void mouseMoved(MouseEvent e)
	{
		showStatus("Mouse Movement x = " + e.getX() + "y = " + e.getY());
	}
	
	  public void mouseDragged(MouseEvent e) {  
	    	x = e.getX();      
	    	y = e.getY();     
	    	msg = "Mouse Dragged";
	    	setBackground(Color.YELLOW);
	    	repaint(); 
	    	} 
	 
	public void mouseReleased(MouseEvent e)
	{
		x =e.getX();
		y = e.getY();
		msg = " Released";
		setBackground(Color.magenta);
		repaint();
	}
	
	public void mouseClicked(MouseEvent e)
	{
		x =0;
		y = 10;
		msg = " Mouse Clicked";
		setBackground(Color.MAGENTA);
		repaint();
	}
	
	public void mousePressed(MouseEvent e)
	{
		x =0;
		y = 10;
		setBackground(Color.pink);
		msg = " Mouse Pressed";
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg, x, y);
	}
}
