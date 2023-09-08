package unit2_6ShallowCopy;

public class MainClass_02{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
//		int a = 22;
//		int b = increase(a);
//		
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
		
		Course science = new Course("Physics", "Chemistry", "Biology");
		System.out.println("Before the change subject1=" + science.getSubject1());
		Course newScience = changeSubject1(science, "TestMath");
		System.out.println("After the change subject1=" + science.getSubject1());
	}
	
	//call by reference
	public static Course changeSubject1(Course courseToChange,String newSubject1){
		courseToChange.setSubject1(newSubject1);
		return courseToChange;
	}
	
	//call by value
	public static int increase(int num){
		num = num + 1; //increase the value of num with 1
		return num;
	}

}
