package day10;

public interface Remocon {

	// 필드 -> 인터페이스는 상수만 올 수 있다!
	static final int minVoL = 0;
	int maxVoL = 99;
	// static final을 추가 안해도 자동으로 상수로 선언됨.
	
	// 생성자X -> 상수값과 메소드만 갖기 때문에 필요 없으며, 선언하지도 못함.
	
	// 메서드 -> 구현부를 정의하지 않은, 추상 메소드만 가능
	
	public abstract void volUp();
	// 위 코드와 아래 코드는 동일함.
	// public abstract 는 생략되어 있음.
	void volDown();
	
}