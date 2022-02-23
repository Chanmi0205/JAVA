
public class Snack {
	
	int GuestCount = 0; // 분식집 이용하고 있는 수
	int money = 0; // 분식집 수입
	String SnackName; // 분식집 이름
	
	public Snack(String SnackName) {
		this.SnackName = SnackName;
	}
	
	public void get(int money) {   
		this.money += money;   // 분식집 수입 증가
		GuestCount++;   // 분식집 이용 인원
	}
	
	public void showInfo() {
		System.out.println(SnackName + "는 현재 " + GuestCount + "명 관람하고 있으며, 수입은 " + money + "원 입니다.");
	}

}
