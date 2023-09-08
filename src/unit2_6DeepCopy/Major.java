package unit2_6DeepCopy;

public class Major implements Cloneable{
	Student classRespresentative;
	
	public Major (Student newStudent){
		this.classRespresentative = newStudent;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
        Major major = (Major) super.clone();
        major.classRespresentative = (Student) this.classRespresentative.clone();
        return major;
    }
}
