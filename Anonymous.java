/*<applet code="Anonymous" width=400 height=600></applet>*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Anonymous extends Applet
{
	Button b;
	boolean flag;
	public void init()
	{
		add(b = new Button("Click"));
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				flag=!flag;
				repaint();
			}
		});
	}

	public void paint(Graphics g)
	{
		if(flag)
			g.fillRect(100,200,200,300);
		else
			g.fillOval(100,200,200,300);
	}
};