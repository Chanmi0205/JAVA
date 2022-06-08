package test;

public class Pigeon extends Animal implements Flyable {

	public Pigeon(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly(int y) { // 매개변수 Y만큼 위치이동
		System.out.println("현재 위치 : " + this.y);
		this.y += y;
		System.out.println("현재 위치에서 " + this.y + "로 이동하였습니다.");
	}

	@Override
	public void flyMove(int x, int y) { // 매개변수 X, Y만큼 이동
		System.out.println("현재 위치 : " + this.x +", "+ this.y);
		this.x += x;
		this.y += y;
		System.out.println("현재 좌우로 " + this.x + ", " + this.y + "만큼 이동하였습니다.");
		
	}

}
