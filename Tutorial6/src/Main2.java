
public class Main2 {
	
	public static void main(String[] args) {
		
		String a = "Man";
		int b = 0;
		
		// �ڹٴ� String�� ���� �� equal()�� �̿��Ѵ�.
		// �� ������ String�� �ٸ� �ڷ����� �ٸ� ���ڿ� �ڷ����̱� �����̴�.
		
		if ( a.equals("Man")) { 
			
			System.out.println("�����Դϴ�"); 
			
			
		}
		
		else {
			
			System.out.println("���ڰ� �ƴմϴ�.");
			
		}

		
    	if ( b==3 ) {
    		
		    System.out.println("3�� �ƴմϴ�");
		    
		    
	}
     	else {
     		
 		    System.out.println("3�� �ƴմϴ�");
 		    
	}
	
	
    	if (a.equalsIgnoreCase("man") && b == 0 )  	{ //equalsIgnoreCase : �빮��, �ҹ��� ���� ���� �Ǻ�����
	  
    		System.out.println("���Դϴ�.");
	}
    	
    	
    	else{ 
    		
	  	   System.out.println("�����Դϴ�.");
	  	   
	  	   
	}
 }
}