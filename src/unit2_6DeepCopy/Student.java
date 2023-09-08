package unit2_6DeepCopy;

public class Student implements Cloneable{
	public int id; 
    public String name;
    public Course course;

    //copy constructor
    public Student(Student studentToBeCopied){
    	this.id = studentToBeCopied.id;
    	this.name = studentToBeCopied.name;
    	this.course = new Course(studentToBeCopied.course);
    }
    
    //constructor
    public Student(int id, String name, Course course)
    {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    
    
    //If you have a reference data type containing another reference data type,
    //which in turn contains another data type, 
    //only the last one in the "chain" may use the default clone()-method
    //The other which are "before" the last one in the chain
    //must implement explicit cloning 
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        student.name = new String(this.name);
        return student;
    }
}
