
public class Student {
	
	String studentName; // 학생 이름
	int money; // 학생 돈
	boolean State = false;
	boolean ticket = false;
	boolean food = false;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
		
	public void ticket_get(Movie movie) {   // 영화관 표 구매  
		
		if ( State == false )  {
		State = true;
		ticket = true;
		this.money -= 12000;  
		movie.get(12000);
		System.out.println("현재 " + studentName + "님께서 영화관을 이용중이십니다.");
		}
		else {
			System.out.println("현재 " + studentName + "님께서 다른 매장을 이용중입니다.");
		}
		
	}
	
	public void PD_get(Movie movie) {  // Popcorn(팝콘) & Drink(음료) 구매
		if ( ticket == true && State == true ) {
		this.money -= 17000; 
		movie.get(17000);
		System.out.println("현재 " + studentName + "님께서 영화관에서 팝콘&음료 세트를 구매하셨습니다.");
		}
		else {
			System.out.println("현재 " + studentName + "님께서 매장(매가박스)을 이용하지 않으므로 구매하실 수 없습니다.");
		}
	}
	
	public void Drink_get(Cafe cafe) {    // 카페 음료 구매
		if ( State == false ) {
		State = true;
		this.money -= 5000;   
		cafe.Drink(5000);
		System.out.println("현재 " + studentName + "님께서 카페에서 음료를 구매하셨습니다.");
		}
		else {
			System.out.println("현재 " + studentName + "님께서 다른 매장을 이용중입니다.");
		}
	}
	
	public void BasicMenu(Snack snack) {   // 떡볶이 구매   
		if ( State == false ) {
		State = true;
		food = true;
		this.money -= 3000;   
		snack.get(3000);
		System.out.println("현재 " + studentName + "님께서 분식집에 입장하셨습니다.");
		}
		else {
		System.out.println("현재 " + studentName + "님께서 다른 매장을 이용중입니다.");
		}
	}
	
	public void BasicMenu_get(Snack snack) {
		if ( State == true && food == true )  {
			this.money -= 3000;   
			snack.get(3000);
			System.out.println("현재 " + studentName + "님께서 분식집에서 떡볶이를 구매하셨습니다.");
		}
		else {
			System.out.println("현재 " + studentName + "님께서 매장(분식집)을 이용하지 않으므로 구매하실 수 없습니다.");
		}
		
	}
	
	public void Fried_get(Snack snack) {  // 튀김 구매
		if ( State == true && food == true ) {
		this.money -= 500;
		snack.get(500);
		System.out.println("현재 " + studentName + "님께서 분식집에서 튀김을 구매하셨습니다.");
		}
		else {
			System.out.println("현재 " + studentName + "님께서 매장(분식집)을 이용하지 않으므로 구매하실 수 없습니다.");
		}
	}
	
	public void GoOut() {
		State = false;
	    ticket = false;
	    food = false;
		System.out.println("현재 이용중이신 매장을 " + studentName + "님이 나가셨습니다.");
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}


}
