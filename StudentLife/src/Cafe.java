
public class Cafe {
	
	int GuestCount = 0; // ī�� �̿��ϰ� �ִ� ��
	int money = 0; // ī�� ����
	String CafeName; // ī�� �̸�
	
	public Cafe(String CafeName) {
		this.CafeName = CafeName;
	}
	
	public void Drink(int money) {
		this.money += money;   // ī�� ���� ����
		GuestCount++;   // ī�� �̿� �ο�
	}
	
	public void showInfo() {
		System.out.println(CafeName + "�� ���� " + GuestCount + "�� �����ϰ� ������, ������ " + money + "�� �Դϴ�.");
	}

}
