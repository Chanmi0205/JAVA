package submit;

public class Test03 {
	public static void main(String[] args) {
		
		Calculator test1 = new Calculator(20, 10);
		
		System.out.println("���� �� : "+test1.plus());
		System.out.println("�� �� : "+test1.minus());
		System.out.println("���� �� : "+test1.multiply());
		System.out.println("���� �� : "+test1.divide());

		Calculator test2 = new Calculator(12.3, 3.1);

		System.out.println("���� �� : "+Math.round(test2.plus2()*100)/100.0);
		System.out.println("�� �� : "+Math.round(test2.minus2()*100)/100.0);
		System.out.println("���� �� : "+Math.round(test2.multiply2()*100)/100.0);
		System.out.println("���� �� : "+Math.round(test2.divide2()*100)/100.0);

	}

}
