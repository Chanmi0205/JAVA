
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
			System.out.println("���߱����� �̿����Դϴ�.");
		}
		else {
	
		   if ( money < 1000 ) {
				System.out.println("���� �ݾ��� "+ money + "�̹Ƿ� �����Ͻ� �� �����ϴ�.");
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
		System.out.println("���߱��� �̿����Դϴ�.");
		}
		
		else {
			
			   if ( money < 1500 ) {
					System.out.println("���� �ݾ��� "+ money + "�̹Ƿ� �����Ͻ� �� �����ϴ�.");
			   }	
	           if ( money >= 1500 )  {
					subway.take(1500);
				this.money -= 1500;
				
	           }
	           
			}
          
	}
}

	
	
	
	public void showInfo( ) {
		System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�.");
	}
	
	

}
