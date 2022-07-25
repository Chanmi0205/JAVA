import java.awt.FlowLayout;
import javax.swing.*;

public class MyFrame2 extends JFrame {
	
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		setVisible(true);
	}

}
