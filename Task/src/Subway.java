
public class Subway {
	
	String lineNumber;
	int passengerCount;
	int money; 
	boolean T_system = false; // ȯ�½ý���
	
	public Subway(String lineNuber) {
		this.lineNumber = lineNuber;
	}
	
	public void takeCount() {
		if ( passengerCount > 10 ) {
			System.out.println("�ο� �ʰ��Դϴ�.");
		}
		else {
			System.out.println("ž���Ͻ� �°��� �� " + passengerCount + "�� �Դϴ�.");
	}
}
	
	public void subway_off() {  // ���� 
		if ( passengerCount > 0 ) {
			passengerCount--;	
			this.T_system = true;
		}
		else {
			System.out.println("ž���� �°��� 0���̹Ƿ�"
					+ " �� �̻� ���� ����� �����ϴ�.");
		}
	}
		
	
	public void take(int money) {
		if ( passengerCount > 20 )  {
			System.out.println("ž���� �Ұ����Ͽ� ����� �������� �ʾҽ��ϴ�.");
		}
		else {
			if ( money > 0 && passengerCount <= 20 ) {
			this.money += money;  // ���
			passengerCount++;
			}
		}
	}
	
	
	public void showInfo() {
		System.out.println(lineNumber + " �� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�. ");
	}

}
