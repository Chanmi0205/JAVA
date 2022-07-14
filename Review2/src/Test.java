
public class Test {
	public static void main(String[] args) {
		
		A chanmi = new A("박찬미", 18);
		chanmi.setName("찬미");
		
		A nara = new B("김나라", 18, "girl");
		
		// 부모 클래스에서 자식 클래스로 자동 형변환이 되지만
		// 자식 클래스에서 부모 클래스로 형변환한다면 오류가 발생함
		// 따라서 강제 형변환을 해야함.
		
		// 아래 코드는 위와 같은 이유로 오류가 발생함.
		// B test = new A("테스트", 3);
		
		System.out.println(chanmi.toString());
		
		// 자동 형변환을 하여도 자식 클래스에 있는 메소드는 사용 못함.
		
		// 따라서 아래 코드는 오류가 발생함.
		// nara.setGender("female");
		
		System.out.println(nara.toString());
	}

}
