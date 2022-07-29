import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class RadioButtonFrame extends JFrame implements ActionListener {

	private JRadioButton small, medium, large;
	private JRadioButton Arabica, Robusta, Liberica;
	
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel, menuPanel;
	
	public RadioButtonFrame() {
		
		setTitle("라디오 버튼 테스트");
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");
		
		Border border = BorderFactory.createTitledBorder("크기");
		sizePanel.setBorder(border);
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		add(sizePanel, BorderLayout.WEST);
		
		menuPanel = new JPanel();
		Arabica = new JRadioButton("Arabica");
		Robusta = new JRadioButton("Robusta");
		Liberica = new JRadioButton("Liberica");

		Border border2 = BorderFactory.createTitledBorder("종류");
		menuPanel.setBorder(border2);
		
		ButtonGroup menu = new ButtonGroup();
		menu.add(Arabica);
		menu.add(Robusta);
		menu.add(Liberica);

		Arabica.addActionListener(this);
		Robusta.addActionListener(this);
		Liberica.addActionListener(this);
		
		menuPanel.add(Arabica);
		menuPanel.add(Robusta);
		menuPanel.add(Liberica);
		add(menuPanel, BorderLayout.CENTER);
		
		resultPanel = new JPanel();
		text = new JLabel("크기가 선택되지 않았습니다.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if ( e.getSource() == small ) 
			text.setText("Small 크기가 선택되었습니다.");
		if ( e.getSource() == medium )
			text.setText("Medium 크기가 선택되었습니다.");
		if ( e.getSource() == large ) 
			text.setText("Large 크기가 선택되었습니다.");
		
	}

	public static void main(String[] args) {
		new RadioButtonFrame();
	}
}
