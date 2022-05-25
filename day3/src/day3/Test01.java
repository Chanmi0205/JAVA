package day3;

public class Test01 {
	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr[i].length+1; j++) {
				arr[i][j-1] = (4*i)+j;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		int[][] rotatedArr = new int[4][4];
		
		for(int i=0; i<rotatedArr.length; i++) {
			for(int j=0; j<rotatedArr[i].length; j++) {
				rotatedArr[i][j] = arr[rotatedArr.length - 1 - i][j];
			}
		}

		for(int i=0; i<rotatedArr.length; i++) {
			for(int j=0; j<rotatedArr[i].length; j++) {
				System.out.print(rotatedArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
