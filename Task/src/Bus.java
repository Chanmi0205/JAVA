
public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	int bus_off; // ����
	boolean T_system = false; // ȯ�½ý���
	
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void takeCount() {
		if ( passengerCount > 10 ) {
			System.out.println("�ο� �ʰ��Դϴ�.");
		}
		else {
			System.out.println("ž���Ͻ� �°��� �� " + passengerCount + "�� �Դϴ�.");
	}	
}
	
	public void bus_off() {  // ���� 
		if ( passengerCount > 0 ) {
			passengerCount--;
			this.T_system = true;
		}
		
		else {
			System.out.println("ž���� �°��� 0���̹Ƿ� �� �̻� ���� ����� �����ϴ�.");
		}
	}
	
	
	public void take(int money) {
		if ( passengerCount > 10 )  {
			System.out.println("ž���� �Ұ����Ͽ� ����� �������� �ʾҽ��ϴ�.");
		}
		else {
			if ( money > 0 ) {
			this.money += money;  // ���
			passengerCount++;
			}
		}
	}
	
	public void showInfo() {
		System.out.println("���� " + busNumber + "���� �°��� "+ passengerCount+" ���̰�, ������ " + money + "�Դϴ�.");
	}

}
