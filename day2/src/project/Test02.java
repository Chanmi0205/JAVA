package project;

public class Test02 {
	public static void main(String[] args) {
		
		String array[][] = new String[5][];
		
		for(int i=0; i<5; i++) {
			array[i] = new String[i+1];
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) { 
					array[i][j] = "*";
			}	
		}

		
		for(int i=0; i<array.length; i++) { 
			for(int j=0; j<array[i].length; j++) {
					System.out.print(array[i][j]);
			}
		System.out.println();
		}
		
	}
}