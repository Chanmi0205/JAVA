package submit;

public class Test03 {
	public static void main(String[] args) {
		
		Calculator test1 = new Calculator(20, 10);
		
		System.out.println("渦и 高 : "+test1.plus());
		System.out.println("賓 高 : "+test1.minus());
		System.out.println("培и 高 : "+test1.multiply());
		System.out.println("釭換 高 : "+test1.divide());

		Calculator test2 = new Calculator(12.3, 3.1);

		System.out.println("渦и 高 : "+Math.round(test2.plus2()*100)/100.0);
		System.out.println("賓 高 : "+Math.round(test2.minus2()*100)/100.0);
		System.out.println("培и 高 : "+Math.round(test2.multiply2()*100)/100.0);
		System.out.println("釭換 高 : "+Math.round(test2.divide2()*100)/100.0);

	}

}
