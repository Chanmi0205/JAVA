
public class Test {
	public static void main(String[] args) {
		
		A chanmi = new A("������", 18);
		chanmi.setName("����");
		
		A nara = new B("�質��", 18, "girl");
		
		// �θ� Ŭ�������� �ڽ� Ŭ������ �ڵ� ����ȯ�� ������
		// �ڽ� Ŭ�������� �θ� Ŭ������ ����ȯ�Ѵٸ� ������ �߻���
		// ���� ���� ����ȯ�� �ؾ���.
		
		// �Ʒ� �ڵ�� ���� ���� ������ ������ �߻���.
		// B test = new A("�׽�Ʈ", 3);
		
		System.out.println(chanmi.toString());
		
		// �ڵ� ����ȯ�� �Ͽ��� �ڽ� Ŭ������ �ִ� �޼ҵ�� ��� ����.
		
		// ���� �Ʒ� �ڵ�� ������ �߻���.
		// nara.setGender("female");
		
		System.out.println(nara.toString());
	}

}
