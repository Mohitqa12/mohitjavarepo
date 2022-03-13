package pkg1;

public class Student {

	int rollno, age;

	public void display1() {

		System.out.println("welcome to all of you.");
	}

	public void display2() {
		System.out.println("automation is very easy.");
	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.display1();
		obj.display2();
		obj.rollno = 102;
		obj.age = 10; 
		System.out.println("student roll no " + obj.rollno + "\n" + "student age " + obj.age);
		
	
		//int m = obj.rollno = 10;
		//System.out.println(obj.rollno);
		//System.out.println(m);
		//System.out.println(obj.age = 20);
	}
}
