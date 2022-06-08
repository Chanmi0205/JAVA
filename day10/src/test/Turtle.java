package test;

public class Turtle extends Animal implements Swimable {

	public Turtle(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swimDown(int y) {
		// TODO Auto-generated method stub
		System.out.println("현재 위치 : " + this.y); 
		this.y -= y;
		System.out.println("수영했습니다.");
	}

}
