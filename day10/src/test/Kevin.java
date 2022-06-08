package test;

public class Kevin extends Human implements Programmer, Swimable {

	public Kevin(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swimDown(int y) { // 매개변수 Y만큼 본인의 Y좌표 값 감소
		// TODO Auto-generated method stub
		if ( y < - 20 ) { // Y값이 -20보다 작을 때 사망함.
			System.out.println("사망하였습니다.");
		} else {
			System.out.println("현재 위치 : " + this.y); 
			this.y += y;
			System.out.println(this.y + "으로, 수영했습니다.");
		}
	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		System.out.println("코딩하는중");
	}

}
