package day7;

public class Car {
	
	// �ν��Ͻ� �ʵ� 
	int gas;
	final String owner = "yeji";
	
	// ���� �ʵ�
	static int oilPrice;
	
	// ���� �޼���
	static void setGas(int gas) {
//		// ��������� �޶� ���� �߻���.
//		this.gas = gas;
		// (static)setGas �޼��� -> (stack area)c1 -> (heap area)new Car() (�ʿ��� �������� �׶��׶� �߰��ϴ°�);
		
		// �ν��Ͻ� �ʵ带 �����ҷ��� �ν��Ͻ��� �����ϰ� �����ؾ���.
		Car c1 = new Car();
		c1.setSpeed(100);
	}
	
	// �ν��Ͻ� �޼���
	void setSpeed(int speed) {
		gas = speed;
	}

}
