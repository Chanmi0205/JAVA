package data;

public class Sell {
	public static void main(String[] args) {
		
		// �������� ���� ����Ҹ� ������ ����(���� ����)
		// FishBread potbung;
		
		FishBread potbung = new FishBread(1100);
		potbung.flavor = "��";
		
		FishBread shubung = new FishBread();
		shubung.flavor = "��ũ��";
		
		System.out.println("�ؾ��");
		// �Ʒ� �ڵ�� ������ ī��
		potbung.sayFlavor();		
		// System.out.println(potbung.flavor);	
		
		System.out.println("- "+shubung.flavor);
		
		System.out.println("==============");
		System.out.println("���� ���� : "+potbung.price);
		//System.out.println(potbung.showPrice());
		System.out.println("��ũ���� ���� : " + shubung.price);
		
		System.out.println("==============");
		
//		double shuSize = shubung.sizing(5.5);
//		System.out.println(shuSize);
		 
		System.out.println("�Ϻ� ũ�� : "+potbung.sizing(1.5));
		System.out.println("��ũ���� ũ��(�⺻��) : "+shubung.size);
	}

}