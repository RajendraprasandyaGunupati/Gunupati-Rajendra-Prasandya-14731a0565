import java.util.Date;
public class Main {
    public studentArrayOperation studInterface=new studentArrayOperation();
	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Student stud1=new Student(1,"raji",new Date,25);
		student stud2=new Student(2,"prasandya",new Date,25);
		studInterface.add(stud1,0);
		studInterface.add(stud2,1);
		try
		{
			System.out.println(studInterface.getStudent(0));
		}
		catch(Exception e){ }
	}

}
