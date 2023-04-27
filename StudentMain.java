
import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int studentid;
	String studentname;
	float studentfees;
	
	
	
	public Student(int studentid, String studentname, float studentfees) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentfees = studentfees;
	}



	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentfees=" + studentfees
				+ "]";
	}



	
	
}
public class StudentMain {

	public static void main(String[] args) {
		
            Student s1=new Student(1,"Manoj", 7865.4f);
            Student s2=new Student(2,"Kiran", 8865.4f);
            Student s3=new Student(3,"Swetha", 17865f);
            Student s4=new Student(4,"Praveen", 9865.4f);
            
            //ArrayList for user defined datatype
            ArrayList<Student> slist=new ArrayList<Student>();
            slist.add(s1);
            slist.add(s2);
            slist.add(s3);
            slist.add(s4);
            
            System.out.println(slist);
            
            //Using Iterator
            Iterator<Student> sit=slist.iterator();
            
            System.out.println("Student ID\tStudentName\tStudent Fees");
            while(sit.hasNext()) {
            Student s=sit.next();
            System.out.println(s.studentid+"\t\t"+s.studentname+"\t\t"+s.studentfees);
            }
      }

}

