package day10;

public interface Remocon {

	// �ʵ� -> �������̽��� ����� �� �� �ִ�!
	static final int minVoL = 0;
	int maxVoL = 99;
	// static final�� �߰� ���ص� �ڵ����� ����� �����.
	
	// ������X -> ������� �޼ҵ常 ���� ������ �ʿ� ������, ���������� ����.
	
	// �޼��� -> �����θ� �������� ����, �߻� �޼ҵ常 ����
	
	public abstract void volUp();
	// �� �ڵ�� �Ʒ� �ڵ�� ������.
	// public abstract �� �����Ǿ� ����.
	void volDown();
	
}