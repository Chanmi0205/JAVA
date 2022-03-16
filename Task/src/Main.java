
public class Main {
// 메인 클래스이지만 대중교통 시스템 클래스라 하죠 :> 
	
	public static void main(String[] args) {
		
		Student Chanmi = new Student("박찬미", 4000);
		Student Giang = new Student("정기앙", 4000);
		Student Nara = new Student("김나라", 4000);
		Student Gyujin = new Student("이규진", 4000);
		Student Jaewon = new Student("신재원", 4000);
		
		Student Yoonsoo = new Student("이윤수", 3500);
		Student Taesung = new Student("박태성", 3500);
		Student Eunsoo = new Student("김은수", 3500);
		Student Daeyong = new Student("이대용", 3500);
		Student Minhyung = new Student("박민형", 3500);
		
		Student Seungsoo = new Student("최승수", 2000);
		Student Jimin = new Student("홍지민", 2000);
		Student Dongyeon = new Student("이동연", 2000);
		Student Younghong = new Student("이영홍", 2000);
		Student Yubin = new Student("임유빈", 2000);
		
		Student Minseo = new Student("김민서", 1500);
		Student Suhyun = new Student("박수현", 1500);
		Student Junyoung = new Student("배준영", 1500);
		Student Jinhyo = new Student("배진효", 1500);
		Student Subin = new Student("김수빈", 1000);
		
		Student Eunho = new Student("김은호", 2000);
		Student babo = new Student("이바보", 2000);
		Student Chichen = new Student("양치킨", 2000);
		Student Pizza = new Student("큐피자", 2000);
		Student Kimchi = new Student("연김치", 2000);
		
		Bus bus100 = new Bus(100);
		Subway subway10 = new Subway("chan");
		
		
		Chanmi.takeSubway(subway10);  // 지하철 타기
		Giang.takeSubway(subway10);  // 지하철 타기
		Nara.takeSubway(subway10);  // 지하철 타기
		Gyujin.takeSubway(subway10);  // 지하철 타기
		Jaewon.takeSubway(subway10);  // 지하철 타기
		
		Yoonsoo.takeSubway(subway10);  // 지하철 타기
		Taesung.takeSubway(subway10);  // 지하철 타기
		Eunsoo.takeSubway(subway10);  // 지하철 타기
		Daeyong.takeSubway(subway10);  // 지하철 타기
		Minhyung.takeSubway(subway10);  // 지하철 타기
		
		Seungsoo.takeSubway(subway10);  // 지하철 타기
		Jimin.takeSubway(subway10);  // 지하철 타기
		Dongyeon.takeSubway(subway10);  // 지하철 타기
		Younghong.takeSubway(subway10);  // 지하철 타기
		Yubin.takeSubway(subway10);  // 지하철 타기
		
		Minseo.takeSubway(subway10);  // 지하철 타기
		Suhyun.takeSubway(subway10);  // 지하철 타기
		Junyoung.takeSubway(subway10);  // 지하철 타기
		Jinhyo.takeSubway(subway10);  // 지하철 타기
		Subin.takeSubway(subway10);  // 지하철 타기
		
		Eunho.takeSubway(subway10);  // 지하철 타기
		babo.takeSubway(subway10); // 지하철 타기 
		
		
		subway10.showInfo();  // 지하철 승객, 수입 출입
		
		subway10.takeCount();
		Chanmi.takeBus(bus100);  // 버스 타기
		
		

		
		
		

	}

}
// 환승시스템까지 넣을려다가 너무 어려워서 제외하고 풀었습니다