package day10;

public class Tv implements Remocon {
	
	// �ʵ�
	private int vol;
	
	//������
	public Tv() {
		System.out.println("TV ����");
	}
	
	// �޼ҵ�
	public void setVolumn(int vol) {
		if ( vol > Remocon.maxVoL ) {
			this.vol = Remocon.maxVoL;
		} else if ( vol < Remocon.minVoL ) {
			this.vol = Remocon.minVoL;
		} else {
			this.vol = vol;
		}
	}
	
	// �������̽����� �Ѿ�� �߻�޼����
	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		System.out.println("���� ��");
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		System.out.println("���� �ٿ�");
	}

}