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
	public void swimDown(int y) { // �Ű����� Y��ŭ ������ Y��ǥ �� ����
		// TODO Auto-generated method stub
		if ( y < - 20 ) { // Y���� -20���� ���� �� �����.
			System.out.println("����Ͽ����ϴ�.");
		} else {
			System.out.println("���� ��ġ : " + this.y); 
			this.y += y;
			System.out.println(this.y + "����, �����߽��ϴ�.");
		}
	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ��ϴ���");
	}

}
