package data;

public class Sell {
	public static void main(String[] args) {
		
		// 존재하지 않은 저장소를 가지고 있음(참조 변수)
		// FishBread potbung;
		
		FishBread potbung = new FishBread(1100);
		potbung.flavor = "팥";
		
		FishBread shubung = new FishBread();
		shubung.flavor = "슈크림";
		
		System.out.println("붕어빵들");
		// 아래 코드는 동일한 카드
		potbung.sayFlavor();		
		// System.out.println(potbung.flavor);	
		
		System.out.println("- "+shubung.flavor);
		
		System.out.println("==============");
		System.out.println("팥의 가격 : "+potbung.price);
		//System.out.println(potbung.showPrice());
		System.out.println("슈크림의 가격 : " + shubung.price);
		
		System.out.println("==============");
		
//		double shuSize = shubung.sizing(5.5);
//		System.out.println(shuSize);
		 
		System.out.println("팥붕 크기 : "+potbung.sizing(1.5));
		System.out.println("슈크림의 크기(기본값) : "+shubung.size);
	}

}