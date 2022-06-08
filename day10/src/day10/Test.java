package day10;

public class Test {
	public static void main(String[] args) {
	
		Remocon rc = new Tv();
		rc.volUp();
		rc.volDown();
		
		((Tv) rc).setVolumn(3);

	}

}
