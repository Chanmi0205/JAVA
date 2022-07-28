import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 50, 50);
		g.drawOval(200, 50, 50, 50);
	}
}
