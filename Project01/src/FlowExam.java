import javax.swing.*;
import java.awt.FlowLayout;

public class FlowExam extends JFrame {
	JPanel p1;
	public FlowExam() {
		
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		
		for(int i=0; i<10; i++) 
			p1.add(new JButton("Button" + i));
		
		add(p1);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		FlowExam f = new FlowExam();
	}

}
