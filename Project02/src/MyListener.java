import java.awt.event.*;
import javax.swing.JButton;

public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("마침내 버튼이 눌려졌습니다.");
		//label.setText("마침내 버튼이 눌러졌습니다.");
	}
}
