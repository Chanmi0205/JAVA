package project;

public class Test01 {
	public static void main(String[] args) {
		// int array[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int array[][] = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=1; j<4; j++) {
				array[i][j-1] = (3*i)+j;
			}
 		}
		
		for(int i=0; i<array.length; i++ ) {
			for(int j=0; j<array[i].length; j++ ) {
				System.out.print(array[i][j] + " ");
			}
		}
	}

}