package day5;

public class CallByTest {
	public static void main(String[] args) {
		
		CallByTest test = new CallByTest();
		
		int value = 10;
		
		int[] arr = {10, 20, 30, 40};
		
//		System.out.println(test.addOne(value));
//		System.out.println(value);
		
		test.addOne(arr);
		
		System.out.println("----------------");
		
		// 참조변수여서
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
			
	}

	public int addOne(int value) {
		value++;
		return value;
	}
	
	public void addOne(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]++;
			System.out.println(arr[i]);
		}
	}
}