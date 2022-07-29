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
		
		setTitle("���� ��ư �׽�Ʈ");
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");
		
		Border border = BorderFactory.createTitledBorder("ũ��");
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

		Border border2 = BorderFactory.createTitledBorder("����");
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
		text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if ( e.getSource() == small ) 
			text.setText("Small ũ�Ⱑ ���õǾ����ϴ�.");
		if ( e.getSource() == medium )
			text.setText("Medium ũ�Ⱑ ���õǾ����ϴ�.");
		if ( e.getSource() == large ) 
			text.setText("Large ũ�Ⱑ ���õǾ����ϴ�.");
		
	}

	public static void main(String[] args) {
		new RadioButtonFrame();
	}
}
