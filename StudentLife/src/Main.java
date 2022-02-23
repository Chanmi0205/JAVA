
public class Main {
	
	public static void main(String[] args) {
		
		Student Chanmi = new Student("Chanmi", 50000);
		Student nara = new Student("nara", 70000);
		Student Giang = new Student("Giang", 80000);
		
		Cafe starbucks = new Cafe("starbucks");
		Movie Maegabox = new Movie("Maegabox");
		Snack sinjeon = new Snack("sinjeon");
		
		Chanmi.ticket_get(Maegabox);  // 찬미 - 표구매
		nara.ticket_get(Maegabox);  // 나라 - 표구매
		Giang.ticket_get(Maegabox);  // 기앙 - 표구매
		Giang.BasicMenu(sinjeon);  
		// 현재 이용중인 매장을 벗어나지 않았는데 다른 매장을 이용하려 할 때
		
		Chanmi.PD_get(Maegabox);  // 찬미 - 팝콘&음료 세트 구매
		Giang.PD_get(Maegabox);  // 기앙 - 팝콘&음료 세트 구매
		
		Chanmi.GoOut();  // 매장 퇴장
		nara.GoOut();  // 매장 퇴장
		Giang.GoOut();  // 매장 퇴장
		
		
		Chanmi.BasicMenu(sinjeon);  // 분식집에 입장
		nara.BasicMenu(sinjeon);  // 분식집에 입장
		Giang.BasicMenu(sinjeon);  // 분식집에 입장
		
		Chanmi.BasicMenu_get(sinjeon); // 떡볶이 2인분 구매
		Chanmi.BasicMenu_get(sinjeon); 
		Giang.BasicMenu_get(sinjeon); // 떡볶이 1인분 구매
		nara.BasicMenu_get(sinjeon); // 떡볶이 1인분 구매
		
		Chanmi.Fried_get(sinjeon);  // 튀김 구매
		Chanmi.Fried_get(sinjeon);  // 튀김 구매
		Chanmi.Fried_get(sinjeon);  // 튀김 구매
		Chanmi.Fried_get(sinjeon);  // 튀김 구매
		Giang.Fried_get(sinjeon);  // 튀김 구매
		Giang.Fried_get(sinjeon);  // 튀김 구매
		
		Chanmi.GoOut();  // 매장 퇴장
		nara.GoOut();  // 매장 퇴장
		Giang.GoOut();  // 매장 퇴장
	
		
		Chanmi.Drink_get(starbucks); // 1인 1음료 카페 이용
		nara.Drink_get(starbucks); // 1인 1음료 카페 이용
		Giang.Drink_get(starbucks); // 1인 1음료 카페 이용
		
		Chanmi.GoOut();  // 매장 퇴장
		nara.GoOut();  // 매장 퇴장
		Giang.GoOut();  // 매장 퇴장
	}

}
