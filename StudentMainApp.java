import java.util.ArrayList;
import java.util.Iterator;

class Student1{
	private int studentid;
	private String studentname;
	private float studentfees;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public float getStudentfees() {
		return studentfees;
	}
	public void setStudentfees(float studentfees) {
		this.studentfees = studentfees;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentfees=" + studentfees
				+ "]";
	}
	
	
	
}
public class StudentMainApp {

	public static void main(String[] args) {
		
            Student1 s1=new Student1();
            Student1 s2=new Student1();
            s1.setStudentid(1);
    		s1.setStudentname("Siva");
    		s1.setStudentfees(37654.34f);
    		
    		s2.setStudentid(2);
    		s2.setStudentname("Subha");
    		s2.setStudentfees(86654.34f);
           
            //ArrayList for user defined datatype
            ArrayList<Student1> slist=new ArrayList<Student1>();
            slist.add(s1);
            slist.add(s2);
            
            
            System.out.println(slist);
            
            //Using Iterator
            Iterator<Student1> sit=slist.iterator();
            
            System.out.println("Student ID\tStudentName\t\tStudent Fees");
            while(sit.hasNext()) {
            Student1 s=sit.next();
            System.out.println(s.getStudentid()+"\t\t"+s.getStudentname()+"\t\t\t"+s.getStudentfees());
            }
      }

}


