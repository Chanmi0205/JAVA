package day10;

public class Tv implements Remocon {
	
	// 필드
	private int vol;
	
	//생성자
	public Tv() {
		System.out.println("TV 생성");
	}
	
	// 메소드
	public void setVolumn(int vol) {
		if ( vol > Remocon.maxVoL ) {
			this.vol = Remocon.maxVoL;
		} else if ( vol < Remocon.minVoL ) {
			this.vol = Remocon.minVoL;
		} else {
			this.vol = vol;
		}
	}
	
	// 인터페이스에서 넘어온 추상메서드들
	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		System.out.println("볼륨 업");
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		System.out.println("볼륨 다운");
	}

}