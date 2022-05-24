
public class Test04 {
public static void main(String[] args) {
		
		
		String str1 = "java";
		String str2 = "java";

		// 참조 타입을 비교할 때 주소값을 비교함
		if (str1 == str2) {
			System.out.println("같은 주소의 값을 갖고 있습니다.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("안에 들어있는 값이 실제로 같습니다!");
		}
		
		System.out.println("---------------------");
		
		String str3 = new String("java");
		
		if (str1 == str3) {
			System.out.println("주소지가 달라서 출력이 안됩니다.");
		}
		
		// equals는 안에 있는 내용을 비교하는 함수이다.
		if (str1.equals(str3)) {
			System.out.println("안에 들어있는 값이 실제로 같습니다!");
		}
		
		System.out.println("---------------------");
		String str5 = null;
		
		// String.out.println(str5.length()); 못씀. null값이기 때문에
		
		if (str5 == null) {
			System.out.println("같습니당:)");
		}
		
		System.out.println(str1.substring(3)); // 앞에서 부터 3줄을 자르고 출력함
		System.out.println(str1.concat("Hello ")); // 원래 있었던 변수명에 이어붙임
		
	}

}
