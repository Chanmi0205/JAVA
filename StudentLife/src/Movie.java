
public class Movie {
	
	int GuestCount = 0; // 영화관 관람하고 있는 수
	int money = 0; // 영화관 수입
	String MovieName; // 영화관 이름
	
	public Movie(String MovieName) {   // 영화관 이름 지정
		this.MovieName = MovieName;
	}
	
	public void get(int money) {
		this.money += money;   // 영화관 수입 증가
		GuestCount++;   // 영화관 이용 인원
	}
	
	
	public void showInfo() {
		System.out.println(MovieName + "는 현재 " + GuestCount + "명 관람하고 있으며, 수입은 " + money + "원 입니다.");
	}

}
