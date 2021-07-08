package myobj.School_NetworkClass;


public class School_Main {
	public static void main(String[] args) {
		
		Student[] school = new Student[30];
		
		for(int i = 0; i < school.length; ++i) {
			school[i] = new NetworkStudent();
			school[i].printGradeCard();
		}

	}
}
