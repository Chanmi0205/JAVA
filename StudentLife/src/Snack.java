
public class Snack {
	
	int GuestCount = 0; // �н��� �̿��ϰ� �ִ� ��
	int money = 0; // �н��� ����
	String SnackName; // �н��� �̸�
	
	public Snack(String SnackName) {
		this.SnackName = SnackName;
	}
	
	public void get(int money) {   
		this.money += money;   // �н��� ���� ����
		GuestCount++;   // �н��� �̿� �ο�
	}
	
	public void showInfo() {
		System.out.println(SnackName + "�� ���� " + GuestCount + "�� �����ϰ� ������, ������ " + money + "�� �Դϴ�.");
	}

}
