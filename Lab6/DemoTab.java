import java.awt.Color;

import javax.swing.*;
public class DemoTab extends JApplet{
	public void init()
	{
		try {
			SwingUtilities.invokeAndWait(new Runnable()
					{
						public void run() {
							tabcreation();
					}
					}
					);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void tabcreation()
	{
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Colours", new ColorP());
		jtp.addTab("Flowers", new FlowerP());
		jtp.addTab("Cities", new CityP());
		add(jtp);
	}

}


class CityP extends JPanel
{
	public CityP()
	{
		setBackground(Color.green);
		JComboBox jb = new JComboBox();
		jb.addItem("Banglore");
		jb.addItem("Dubai");
		jb.addItem("KAshmir");
		add(jb);
	}
}



class FlowerP extends JPanel
{
	public FlowerP()
	{
		setBackground(Color.red);
		JRadioButton rb = new JRadioButton("Jasmine");
		JRadioButton rb1 = new JRadioButton("Rose");
		JRadioButton rb2 = new JRadioButton("Flower");
		add(rb);
		add(rb1);
		add(rb2);
	}
}



class ColorP extends JPanel
{
	public ColorP()
	{
		setBackground(Color.yellow);
		JCheckBox jc = new JCheckBox("Red");
		JCheckBox jc1 = new JCheckBox("Green");
		JCheckBox jc2 = new JCheckBox("Blue");
		add(jc);
		add(jc1);
		add(jc2);
	}
}
