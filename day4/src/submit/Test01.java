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
			weekday = Day.SUNDAY; // 일요일
			break;
		case 2:
			weekday = Day.MONDAY; // 월요일
			break;
		case 3:
			weekday = Day.THURSDAY; // 화요일
			break;
		case 4:
			weekday = Day.WEDNESDAY; // 수요일
			break;
		case 5:
			weekday = Day.THURSDAY; // 목요일
			break;
		case 6: 
			weekday = Day.FRIDAY; // 금요일
			break;
		case 7:
			weekday = Day.SATURDAY; // 토요일
			break;
		}
		
		System.out.println("오늘은 " + weekday + "입니다.");
		
	}

}