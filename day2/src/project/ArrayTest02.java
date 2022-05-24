package project;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		// int[] = {100, 90, 85, 70}; 선언과 동시에 초기화
		int score[] = {100, 90, 85, 70, 54};
	
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		// 먼저 선언 후 나중에 값 할당
		int score2[];
		// 참조 변수여서 new라는 키워드를 사용해야 함.
		score2 = new int[] {100, 90, 80, 79};
		
		// 선언과 동시에 빈 배열로 초기화
		String[] idontknow = new String[10];
		for(int i=0; i<idontknow.length; i++) {
			System.out.println(idontknow[i]);
		}
		
		int[][] scores = new int[2][3];
		/* ->  (1)
		(2) -> () () ()
		 	   () () () */
		
		System.out.println(scores.length); // (1)
		System.out.println(scores[1].length); // (2)
		
		// int[][] testScores = new int[][3]; 문제 발생
		
		// 문제 X
		int[][] testScores = new int[2][];
		
		testScores[0] = new int[1];
		testScores[1] = new int[2];
		
		System.out.println(testScores[0].length);
		
		// 선언과 동시에 초기화
		int score2x2Arr[][] = {{100, 90, 85, 70}, {80, 70, 60}};
	}

}