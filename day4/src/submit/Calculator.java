package submit;

public class Calculator {
	
	int num1, num2;
	double num3, num4;
	
	public Calculator() {}
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("(정수)계산기가 생성되었습니다.");
	}
	
	public Calculator(double num3, double num4) {
		this.num3 = num3;
		this.num4 = num4;
		System.out.println("(실수)계산기가 생성되었습니다.");
	}
	
	public int plus() {
		return num1 + num2;
	}
	
	public int minus() {
		return num1 - num2;
	}
	
	public int multiply() {
		return num1 * num2;
	}
	
	public int divide() {
		return num1 / num2;
	}
	
	// -----------------------------
	
	public double plus2() {
		return num3 + num4;
	}
	
	public double minus2() {
		return num3 - num4;
	}
	
	public double multiply2() {
		return num3 * num4;
	}
	
	public double divide2() {
		return num3 / num4;
	}

}
