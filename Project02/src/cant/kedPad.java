package cant;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.Caret;

public class kedPad extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {
			"1", "2", "3",
			"4", "5", "6", 
			"7", "8", "9"
	};
	
	public kedPad() {
		
		setSize(300, 200);
		setTitle("My Frame");
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setLayout(new GridLayout(0, 3, 3, 3));
		
		add(tField);
		
		buttons = new JButton[25];
		int index = 0;
		for(int rows=0; rows<3; rows++) {
			for(int cols=0; cols<3; cols++) {
				buttons[index] = new JButton(labels[index]);
				if(cols>=3) {
					buttons[index].setForeground(Color.red);
				} else {
					buttons[index].setForeground(Color.blue); 
				} 
				buttons[index].setForeground(Color.black);
				panel.add(buttons[index]);
				index++;
			}
		}
		
		add(panel);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int i=0;
		for(int rows=0; rows<3; rows++) {
			for(int cols=0; cols<3; cols++) {
				if ( e.getSource() == buttons[i] ) {
					tField.setText(tField.getText() + buttons[i]);
				} else {
					i++;
				}
			}
		}
	}

}
