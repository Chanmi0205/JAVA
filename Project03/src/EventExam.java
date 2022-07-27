import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EventExam extends JFrame {
	
	private JButton button;
	private JButton button2;
	private JPanel panel;
	EventExam2 listener = new EventExam2();
	
	public EventExam() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		panel = new JPanel();
		
		button = new JButton("노란색");
		button2 = new JButton("핑크색");
		
		button.addActionListener(listener);
		button2.addActionListener(listener);
		
		panel.add(button);
		panel.add(button2);
		
		this.add(panel);
		this.setVisible(true);
	}
	
private	class EventExam2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
				if( e.getSource() == button ) {
					panel.setBackground(Color.yellow);
				} else if ( e.getSource() == button2 ) {
					panel.setBackground(Color.pink);
				}	
		}
	}
}
