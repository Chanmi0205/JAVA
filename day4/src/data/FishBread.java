package data;

public class FishBread {
	// 필드(멤버변수)
	public String flavor;
	public int price;
	public double size;

	
	// Overloading
	// 생성자
	public FishBread() {
		this.price = 1000;
		this.size = 10.0;
	}
	
	public FishBread(int price) {
		this.price = price;
	}
	
//	사이즈 지정
//	public FishBread(double size) {
//		this.size = size;
//	}
	
	// 메서드 (동작들)
//	반환형 함수이름 (매개변수) {
//		코드
//	}

	// 메서드
	public void sayFlavor() {
		System.out.println("- " + this.flavor);
	}
	
	public int showPrice() { 
		return price;
	}
	
	public double sizing(double size) {
		this.size = size;
		return size;
	}

}