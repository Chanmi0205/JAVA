package day14;

public class Lotto {
	public static void main(String[] args) {
		
		int LottoNumber[] = new int[6]; 
		
		for(int i=0; i<LottoNumber.length; i++) {
			LottoNumber[i] = (int)(Math.random()*49)+1;
		} 
		
		for(int i=0; i<LottoNumber.length; i++) {
			System.out.println("�ζ� ��ȣ" + (i+1) + " : " + LottoNumber[i]);
		}
		 
		
	} 

}
