
public class Student {
	
	String studentName; // �л� �̸�
	int money; // �л� ��
	boolean State = false;
	boolean ticket = false;
	boolean food = false;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
		
	public void ticket_get(Movie movie) {   // ��ȭ�� ǥ ����  
		
		if ( State == false )  {
		State = true;
		ticket = true;
		this.money -= 12000;  
		movie.get(12000);
		System.out.println("���� " + studentName + "�Բ��� ��ȭ���� �̿����̽ʴϴ�.");
		}
		else {
			System.out.println("���� " + studentName + "�Բ��� �ٸ� ������ �̿����Դϴ�.");
		}
		
	}
	
	public void PD_get(Movie movie) {  // Popcorn(����) & Drink(����) ����
		if ( ticket == true && State == true ) {
		this.money -= 17000; 
		movie.get(17000);
		System.out.println("���� " + studentName + "�Բ��� ��ȭ������ ����&���� ��Ʈ�� �����ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���� " + studentName + "�Բ��� ����(�Ű��ڽ�)�� �̿����� �����Ƿ� �����Ͻ� �� �����ϴ�.");
		}
	}
	
	public void Drink_get(Cafe cafe) {    // ī�� ���� ����
		if ( State == false ) {
		State = true;
		this.money -= 5000;   
		cafe.Drink(5000);
		System.out.println("���� " + studentName + "�Բ��� ī�信�� ���Ḧ �����ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���� " + studentName + "�Բ��� �ٸ� ������ �̿����Դϴ�.");
		}
	}
	
	public void BasicMenu(Snack snack) {   // ������ ����   
		if ( State == false ) {
		State = true;
		food = true;
		this.money -= 3000;   
		snack.get(3000);
		System.out.println("���� " + studentName + "�Բ��� �н����� �����ϼ̽��ϴ�.");
		}
		else {
		System.out.println("���� " + studentName + "�Բ��� �ٸ� ������ �̿����Դϴ�.");
		}
	}
	
	public void BasicMenu_get(Snack snack) {
		if ( State == true && food == true )  {
			this.money -= 3000;   
			snack.get(3000);
			System.out.println("���� " + studentName + "�Բ��� �н������� �����̸� �����ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���� " + studentName + "�Բ��� ����(�н���)�� �̿����� �����Ƿ� �����Ͻ� �� �����ϴ�.");
		}
		
	}
	
	public void Fried_get(Snack snack) {  // Ƣ�� ����
		if ( State == true && food == true ) {
		this.money -= 500;
		snack.get(500);
		System.out.println("���� " + studentName + "�Բ��� �н������� Ƣ���� �����ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���� " + studentName + "�Բ��� ����(�н���)�� �̿����� �����Ƿ� �����Ͻ� �� �����ϴ�.");
		}
	}
	
	public void GoOut() {
		State = false;
	    ticket = false;
	    food = false;
		System.out.println("���� �̿����̽� ������ " + studentName + "���� �����̽��ϴ�.");
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}


}
