import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicPaint {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("�׷��� ���� ���α׷�");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
