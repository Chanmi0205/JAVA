package data;

public class FishBread {
	// �ʵ�(�������)
	public String flavor;
	public int price;
	public double size;

	
	// Overloading
	// ������
	public FishBread() {
		this.price = 1000;
		this.size = 10.0;
	}
	
	public FishBread(int price) {
		this.price = price;
	}
	
//	������ ����
//	public FishBread(double size) {
//		this.size = size;
//	}
	
	// �޼��� (���۵�)
//	��ȯ�� �Լ��̸� (�Ű�����) {
//		�ڵ�
//	}

	// �޼���
	public void sayFlavor() {
		System.out.println("- " + this.flavor);
	}
	
	public int showPrice() { 
		return price;
	}
	
	public double sizing(double size) {
		this.size = size;
		return size;
	}

}