
public class Main {
	
	public static void main(String[] args) {
		
		Student Chanmi = new Student("Chanmi", 50000);
		Student nara = new Student("nara", 70000);
		Student Giang = new Student("Giang", 80000);
		
		Cafe starbucks = new Cafe("starbucks");
		Movie Maegabox = new Movie("Maegabox");
		Snack sinjeon = new Snack("sinjeon");
		
		Chanmi.ticket_get(Maegabox);  // ���� - ǥ����
		nara.ticket_get(Maegabox);  // ���� - ǥ����
		Giang.ticket_get(Maegabox);  // ��� - ǥ����
		Giang.BasicMenu(sinjeon);  
		// ���� �̿����� ������ ����� �ʾҴµ� �ٸ� ������ �̿��Ϸ� �� ��
		
		Chanmi.PD_get(Maegabox);  // ���� - ����&���� ��Ʈ ����
		Giang.PD_get(Maegabox);  // ��� - ����&���� ��Ʈ ����
		
		Chanmi.GoOut();  // ���� ����
		nara.GoOut();  // ���� ����
		Giang.GoOut();  // ���� ����
		
		
		Chanmi.BasicMenu(sinjeon);  // �н����� ����
		nara.BasicMenu(sinjeon);  // �н����� ����
		Giang.BasicMenu(sinjeon);  // �н����� ����
		
		Chanmi.BasicMenu_get(sinjeon); // ������ 2�κ� ����
		Chanmi.BasicMenu_get(sinjeon); 
		Giang.BasicMenu_get(sinjeon); // ������ 1�κ� ����
		nara.BasicMenu_get(sinjeon); // ������ 1�κ� ����
		
		Chanmi.Fried_get(sinjeon);  // Ƣ�� ����
		Chanmi.Fried_get(sinjeon);  // Ƣ�� ����
		Chanmi.Fried_get(sinjeon);  // Ƣ�� ����
		Chanmi.Fried_get(sinjeon);  // Ƣ�� ����
		Giang.Fried_get(sinjeon);  // Ƣ�� ����
		Giang.Fried_get(sinjeon);  // Ƣ�� ����
		
		Chanmi.GoOut();  // ���� ����
		nara.GoOut();  // ���� ����
		Giang.GoOut();  // ���� ����
	
		
		Chanmi.Drink_get(starbucks); // 1�� 1���� ī�� �̿�
		nara.Drink_get(starbucks); // 1�� 1���� ī�� �̿�
		Giang.Drink_get(starbucks); // 1�� 1���� ī�� �̿�
		
		Chanmi.GoOut();  // ���� ����
		nara.GoOut();  // ���� ����
		Giang.GoOut();  // ���� ����
	}

}
