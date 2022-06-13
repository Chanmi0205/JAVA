package day12;

public class StringTrimExample {
	
	
	String trimTest(String tel[]) {
		for(int i=0; i<tel.length; i++) {
			if ( tel[i] == " " ) {
				tel[i] = "";
			}
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		
//		String tel = tel1.trim() + tel2.trim() + tel3.trim();
//		System.out.println(tel);
		
//		StringTrimExample tel1 = new StringTrimExample();
		
		StringTrimExample telTest = new StringTrimExample();
		
		String tel1[] = {" ", " ", "1", "2"};
		String tel2[] = {"3", "4", "5", " "};
		String tel3[] = {" ", " ", "6", "7", "8", "9", " ", " "};
		
		telTest.trimTest(tel1);
		telTest.trimTest(tel2);
		telTest.trimTest(tel3);
		
		for(int i=0; i<tel1.length; i++) {
			System.out.print(tel1[i]);
		}
		
		for(int i=0; i<tel2.length; i++) {
			System.out.print(tel2[i]);
		}
		
		for(int i=0; i<tel3.length; i++) {
			System.out.print(tel3[i]);
		}

		String tel4 = "  98";
		String tel5 = "765  ";
		String tel6 = "   4321   ";
		String result = "";
		
		for(int i=0; i<tel4.length(); i++) {
			if(tel4.charAt(i) == ' ') {
				continue;
			} else {
				result += tel4.charAt(i);
			}
		}
		
		for(int i=0; i<tel5.length(); i++) {
			if(tel5.charAt(i) == ' ') {
				continue;
			} else {
				result += tel5.charAt(i);
			}
		}
		
		for(int i=0; i<tel6.length(); i++) {
			if(tel6.charAt(i) == ' ') {
				continue;
			} else {
				result += tel6.charAt(i);
			}
		}
		System.out.println();
		System.out.print(result);
	}

}
