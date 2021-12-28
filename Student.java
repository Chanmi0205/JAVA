
public class Student {
	
	static int CODENUMBER = 1000;
	int clssNumber = 1;
	int studentID = 0;
	
	public Student() {
		studentID += CODENUMBER;
		CODENUMBER++;
	}

}
