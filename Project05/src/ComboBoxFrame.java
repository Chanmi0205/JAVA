import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame implements ActionListener {

	JLabel label;
	
	public ComboBoxFrame() { 
		setTitle("콤보 박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		String[] animals = {"a", "b", "c"};
		JComboBox animalList = new JComboBox(animals);
		animalList.setSelectedIndex(0);
		animalList.addActionListener(this);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		changePictire(animals[animalList.getSelectedIndex()]);
		add(animalList, BorderLayout.PAGE_START);
		add(label, BorderLayout.PAGE_END);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
		String name = (String) cb.getSelectedItem();
		changePictire(name);
	}
	
	private void changePictire(String string) {
		setName(string);
		ImageIcon icon = new ImageIcon(getName() + ".png");
		label.setIcon(icon);
		label.setText(null);
		
//		if (icon != null ) {
//			label.setText(null);
//		} else {
//			label.setText("이미지가 발견되지 않았습니다.");
//		}
		
	}
	
	public static void main(String[] args) {
		ComboBoxFrame frame = new ComboBoxFrame();
	}

}
