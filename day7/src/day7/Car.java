package day7;

public class Car {
	
	// 인스턴스 필드 
	int gas;
	final String owner = "yeji";
	
	// 정적 필드
	static int oilPrice;
	
	// 정적 메서드
	static void setGas(int gas) {
//		// 저장공간이 달라 오류 발생함.
//		this.gas = gas;
		// (static)setGas 메서드 -> (stack area)c1 -> (heap area)new Car() (필요한 순간에만 그때그때 추가하는거);
		
		// 인스턴스 필드를 접근할려면 인스턴스를 생성하고 접근해야함.
		Car c1 = new Car();
		c1.setSpeed(100);
	}
	
	// 인스턴스 메서드
	void setSpeed(int speed) {
		gas = speed;
	}

}
