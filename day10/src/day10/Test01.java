package day10;

public class Test01 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		String name = null;

		try {
			System.out.println(arr[10]);
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
	}

}
