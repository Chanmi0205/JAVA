
public class Main {
// ���� Ŭ���������� ���߱��� �ý��� Ŭ������ ���� :> 
	
	public static void main(String[] args) {
		
		Student Chanmi = new Student("������", 4000);
		Student Giang = new Student("�����", 4000);
		Student Nara = new Student("�質��", 4000);
		Student Gyujin = new Student("�̱���", 4000);
		Student Jaewon = new Student("�����", 4000);
		
		Student Yoonsoo = new Student("������", 3500);
		Student Taesung = new Student("���¼�", 3500);
		Student Eunsoo = new Student("������", 3500);
		Student Daeyong = new Student("�̴��", 3500);
		Student Minhyung = new Student("�ڹ���", 3500);
		
		Student Seungsoo = new Student("�ֽ¼�", 2000);
		Student Jimin = new Student("ȫ����", 2000);
		Student Dongyeon = new Student("�̵���", 2000);
		Student Younghong = new Student("�̿�ȫ", 2000);
		Student Yubin = new Student("������", 2000);
		
		Student Minseo = new Student("��μ�", 1500);
		Student Suhyun = new Student("�ڼ���", 1500);
		Student Junyoung = new Student("���ؿ�", 1500);
		Student Jinhyo = new Student("����ȿ", 1500);
		Student Subin = new Student("�����", 1000);
		
		Student Eunho = new Student("����ȣ", 2000);
		Student babo = new Student("�̹ٺ�", 2000);
		Student Chichen = new Student("��ġŲ", 2000);
		Student Pizza = new Student("ť����", 2000);
		Student Kimchi = new Student("����ġ", 2000);
		
		Bus bus100 = new Bus(100);
		Subway subway10 = new Subway("chan");
		
		
		Chanmi.takeSubway(subway10);  // ����ö Ÿ��
		Giang.takeSubway(subway10);  // ����ö Ÿ��
		Nara.takeSubway(subway10);  // ����ö Ÿ��
		Gyujin.takeSubway(subway10);  // ����ö Ÿ��
		Jaewon.takeSubway(subway10);  // ����ö Ÿ��
		
		Yoonsoo.takeSubway(subway10);  // ����ö Ÿ��
		Taesung.takeSubway(subway10);  // ����ö Ÿ��
		Eunsoo.takeSubway(subway10);  // ����ö Ÿ��
		Daeyong.takeSubway(subway10);  // ����ö Ÿ��
		Minhyung.takeSubway(subway10);  // ����ö Ÿ��
		
		Seungsoo.takeSubway(subway10);  // ����ö Ÿ��
		Jimin.takeSubway(subway10);  // ����ö Ÿ��
		Dongyeon.takeSubway(subway10);  // ����ö Ÿ��
		Younghong.takeSubway(subway10);  // ����ö Ÿ��
		Yubin.takeSubway(subway10);  // ����ö Ÿ��
		
		Minseo.takeSubway(subway10);  // ����ö Ÿ��
		Suhyun.takeSubway(subway10);  // ����ö Ÿ��
		Junyoung.takeSubway(subway10);  // ����ö Ÿ��
		Jinhyo.takeSubway(subway10);  // ����ö Ÿ��
		Subin.takeSubway(subway10);  // ����ö Ÿ��
		
		Eunho.takeSubway(subway10);  // ����ö Ÿ��
		babo.takeSubway(subway10); // ����ö Ÿ�� 
		
		
		subway10.showInfo();  // ����ö �°�, ���� ����
		
		subway10.takeCount();
		Chanmi.takeBus(bus100);  // ���� Ÿ��
		
		

		
		
		

	}

}
// ȯ�½ý��۱��� �������ٰ� �ʹ� ������� �����ϰ� Ǯ�����ϴ�