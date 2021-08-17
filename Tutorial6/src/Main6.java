
public class Main6 {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for(;;) { //무한 루프 while(ture) 또한 무한 루프
			System.out.println("출력");
			count++;
			if (count == 10) {
				break;
			}
		}
	}

}
