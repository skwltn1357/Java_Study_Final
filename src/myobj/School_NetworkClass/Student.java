package myobj.School_NetworkClass;

abstract public class Student {
	
	static String[] LastNameArray = {
			"��", "��", "��", "��", "��","��","��","��",
			"��","����","����","��","��","��","��","��","��",
			"��","��","��","��","��","����"};
	
	static String[] firstNameArray = {
			"��ȯ","�Ǽ�","����","����","õ��","�ҿ�","��ö","�¸�",
			"����","�¹�","����","����","��ȣ","�ѳ�","����","�ν�",
			"����","��ȣ"};
	
	static String generateRandomName() {
		return LastNameArray[(int)(Math.random() * LastNameArray.length)]
				+ firstNameArray[(int)(Math.random() * firstNameArray.length)];
	}
	
	final static int MAX_SCORE = 100;
	static int generateRandomScore() {
		return (int)(Math.random() * (MAX_SCORE + 1));
	}
	
	String name;
	int kor;
	int eng;
	
	public Student() {
		name = generateRandomName();
		kor = generateRandomScore();
		eng = generateRandomScore();	
	}
	public abstract void printGradeCard();
	
	public String getName() {
		return name;
	}
	}
