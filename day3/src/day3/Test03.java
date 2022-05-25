package day3;

import java.util.Calendar;

public class Test03 {
	public static void main(String[] args) {
		
		
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		Season s = null;
		
		switch (month) {
		case 12, 1, 2:
			s = Season.WINTER;
		break;
		case 3, 4, 5:
			s = Season.SPRING;
		break;
		case 6, 7, 8:
			s = Season.SUMMER;
		break;
		case 9, 10, 11:
			s = Season.AUTUMN;
		break;
		
		
	}
		System.out.println(month + "¿ù, °èÀý : " + s);

	}
}