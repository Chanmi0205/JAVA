package day3;

public class Test02 {
	public static void main(String[] args) {
		 
		int[] arr = new int[4];
		
		for(int row=0; row<arr.length; row++) {
			arr[row] = row;
		}
		
		//전체 자료구조를 순회하도록!!
		//위 코드와 아래 코드는 정확히 동일한 코드이다
//		for(int row:arr) {
//			arr[row] = row;
//		}
		
		//for(사용할 값 : 접근할 자료구조) {}
		for(int value:arr) {
			System.out.print(arr[value] + " ");
		}
	}

}
