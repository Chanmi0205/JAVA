
public class Movie {
	
	int GuestCount = 0; // ��ȭ�� �����ϰ� �ִ� ��
	int money = 0; // ��ȭ�� ����
	String MovieName; // ��ȭ�� �̸�
	
	public Movie(String MovieName) {   // ��ȭ�� �̸� ����
		this.MovieName = MovieName;
	}
	
	public void get(int money) {
		this.money += money;   // ��ȭ�� ���� ����
		GuestCount++;   // ��ȭ�� �̿� �ο�
	}
	
	
	public void showInfo() {
		System.out.println(MovieName + "�� ���� " + GuestCount + "�� �����ϰ� ������, ������ " + money + "�� �Դϴ�.");
	}

}
