package test;

public class Turtle extends Animal implements Swimable {

	public Turtle(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swimDown(int y) {
		// TODO Auto-generated method stub
		System.out.println("���� ��ġ : " + this.y); 
		this.y -= y;
		System.out.println("�����߽��ϴ�.");
	}

}
