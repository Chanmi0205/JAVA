package test;

public class Pigeon extends Animal implements Flyable {

	public Pigeon(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly(int y) { // �Ű����� Y��ŭ ��ġ�̵�
		System.out.println("���� ��ġ : " + this.y);
		this.y += y;
		System.out.println("���� ��ġ���� " + this.y + "�� �̵��Ͽ����ϴ�.");
	}

	@Override
	public void flyMove(int x, int y) { // �Ű����� X, Y��ŭ �̵�
		System.out.println("���� ��ġ : " + this.x +", "+ this.y);
		this.x += x;
		this.y += y;
		System.out.println("���� �¿�� " + this.x + ", " + this.y + "��ŭ �̵��Ͽ����ϴ�.");
		
	}

}
