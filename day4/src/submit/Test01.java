package submit;

import java.util.Calendar;

public class Test01 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int test2 = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(test2);
		
		Day weekday = null;
		
		switch(test2) {
		case 1:
			weekday = Day.SUNDAY; // �Ͽ���
			break;
		case 2:
			weekday = Day.MONDAY; // ������
			break;
		case 3:
			weekday = Day.THURSDAY; // ȭ����
			break;
		case 4:
			weekday = Day.WEDNESDAY; // ������
			break;
		case 5:
			weekday = Day.THURSDAY; // �����
			break;
		case 6: 
			weekday = Day.FRIDAY; // �ݿ���
			break;
		case 7:
			weekday = Day.SATURDAY; // �����
			break;
		}
		
		System.out.println("������ " + weekday + "�Դϴ�.");
		
	}

}