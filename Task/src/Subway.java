
public class Subway {
	
	String lineNumber;
	int passengerCount;
	int money; 
	boolean T_system = false; // 환승시스템
	
	public Subway(String lineNuber) {
		this.lineNumber = lineNuber;
	}
	
	public void takeCount() {
		if ( passengerCount > 10 ) {
			System.out.println("인원 초과입니다.");
		}
		else {
			System.out.println("탑승하신 승객은 총 " + passengerCount + "명 입니다.");
	}
}
	
	public void subway_off() {  // 하차 
		if ( passengerCount > 0 ) {
			passengerCount--;	
			this.T_system = true;
		}
		else {
			System.out.println("탑승한 승객이 0명이므로"
					+ " 더 이상 내릴 사람은 없습니다.");
		}
	}
		
	
	public void take(int money) {
		if ( passengerCount > 20 )  {
			System.out.println("탑승이 불가능하여 요금을 지불하지 않았습니다.");
		}
		else {
			if ( money > 0 && passengerCount <= 20 ) {
			this.money += money;  // 요금
			passengerCount++;
			}
		}
	}
	
	
	public void showInfo() {
		System.out.println(lineNumber + " 의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다. ");
	}

}
