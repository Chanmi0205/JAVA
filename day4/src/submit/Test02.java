package submit;

public class Test02 {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		
		Member m2 = new Member("천예지", "user1000");
		
		Member m3 = new Member("천예지", "user1000", "1111", 99);
		
		System.out.println(m2.name +", "+m2.id);
	
		System.out.println(m3.name +", "+m3.id+", "+m3.password+", "+m3.age);
		
		System.out.println(m2.toString());
	}

}
