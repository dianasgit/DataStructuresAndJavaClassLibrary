package unit2_6ShallowCopy;

public class ShallowCopyInJava {
	
	/*
	 * For the students:
	 * Please make sure you understand these examples very well.
	 * It is very important for your future work to know the difference between deep-copy and shallow-copy
	 * */
	
	
	public static void main(String[] args)
    {
        Course science = new Course("Physics", "Chemistry", "Biology");
        Student student1 = new Student(111, "John", science);
        Student student2 = null;
        try
        {
            //Creating a clone of student1 and assigning it to student2
            student2 = (Student) student1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 
        //Printing the subject3 of 'student1'
        System.out.println("Before changing subject3 of student2, the subject3 of student1 is:" + student1.course.subject3);         //Output : Biology
 
        //Changing the subject3 of 'student2'
        student2.course.subject3 = "Maths";
 
        //This change will be reflected in original student 'student1'
        System.out.println("After changing subject3 of student2, the subject3 of student1 is:" + student1.course.subject3);      //Output : Maths
        
        //Playing area START
//        student2.id = 222;
//        System.out.println("student2.id="  + student2.id);
//        System.out.println("student1.id="  + student1.id);
//        
//        student2.name = "TEST";
//        System.out.println("student2.name="  + student2.name);
//        System.out.println("student1.name="  + student1.name);
        //Playing area  END 
    }
}
