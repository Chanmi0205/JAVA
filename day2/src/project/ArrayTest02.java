package project;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		// int[] = {100, 90, 85, 70}; ����� ���ÿ� �ʱ�ȭ
		int score[] = {100, 90, 85, 70, 54};
	
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		// ���� ���� �� ���߿� �� �Ҵ�
		int score2[];
		// ���� �������� new��� Ű���带 ����ؾ� ��.
		score2 = new int[] {100, 90, 80, 79};
		
		// ����� ���ÿ� �� �迭�� �ʱ�ȭ
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
		
		// int[][] testScores = new int[][3]; ���� �߻�
		
		// ���� X
		int[][] testScores = new int[2][];
		
		testScores[0] = new int[1];
		testScores[1] = new int[2];
		
		System.out.println(testScores[0].length);
		
		// ����� ���ÿ� �ʱ�ȭ
		int score2x2Arr[][] = {{100, 90, 85, 70}, {80, 70, 60}};
	}

}