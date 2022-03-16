
public class Student {
	
	public String studentName;
	public int grade;
	public int money;
	boolean takeState_bus = false;
	boolean takeState_subway = false;
	boolean T_system = true;
	int passengerCount = 0;
	
	
	public Student(String name, int money) {
		studentName = name;
		this.money = money;
	}
	
	void takeBus(Bus bus) {
		if ( T_system ) {
		if ( takeState_bus ) {
			System.out.println("대중교통을 이용중입니다.");
		}
		else {
	
		   if ( money < 1000 ) {
				System.out.println("현재 금액이 "+ money + "이므로 승차하실 수 없습니다.");
		   }	
           if ( money >= 1000 )  {
				bus.take(1000);
			this.money -= 1000;
			
           }
           
		}
	}

	}

	
	void takeSubway(Subway subway) {
		if ( T_system ) {
			
		if ( takeState_subway ) {
		System.out.println("대중교통 이용중입니다.");
		}
		
		else {
			
			   if ( money < 1500 ) {
					System.out.println("현재 금액이 "+ money + "이므로 승차하실 수 없습니다.");
			   }	
	           if ( money >= 1500 )  {
					subway.take(1500);
				this.money -= 1500;
				
	           }
	           
			}
          
	}
}

	
	
	
	public void showInfo( ) {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
	

}
