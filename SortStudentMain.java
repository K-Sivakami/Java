import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student2{
	int studentid;
	String studentname;
	float studentfees;

	public Student2(int studentid, String studentname, float studentfees) {
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

class SortStudentFees implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.studentfees>o2.studentfees)
			return 1;
		if(o1.studentfees<o2.studentfees)
			return -1;
		else
		return 0;
	}
	
}
class SortStudentBasedId implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.studentid>o2.studentid) 
			return 1;
		else if(o1.studentid<o2.studentid)
			return -1;
		else 
			return 0;
	}
	
}
class SortStudentBasedOnName implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		return o1.studentname.compareTo(o2.studentname);
	}
	
}

public class SortStudentMain {

	public static void main(String[] args) {
		
            Student2 s1=new Student2(5,"Manoj", 7865.4f);
            Student2 s2=new Student2(2,"Kiran", 8865.4f);
            Student2 s3=new Student2(1,"Swetha", 17865f);
            Student2 s4=new Student2(4,"Praveen", 9865.4f);
            
            //ArrayList for user defined datatype
            ArrayList<Student2> slist=new ArrayList<Student2>();
            slist.add(s1);
            slist.add(s2);
            slist.add(s3);
            slist.add(s4);
            
            System.out.println(slist);
            
            //Using Iterator
            Iterator<Student2> sit=slist.iterator();
            
            System.out.println("Student ID\tStudentName\tStudent Fees");
            while(sit.hasNext()) {
            Student2 s=sit.next();
            System.out.println(s.studentid+"\t\t"+s.studentname+"\t\t"+s.studentfees);
            }
            
            //After sorting based fees
            SortStudentFees sf=new SortStudentFees();
            Collections.sort(slist,sf);
            
            System.out.println("Sorted List based on fees");
            System.out.println(slist);
            
            //Based on Student id
            SortStudentBasedId sid=new SortStudentBasedId();
            Collections.sort(slist,sid);
            
            System.out.println("Sorted students based on id");
            System.out.println(slist);
          //Based on Student name
            SortStudentBasedOnName sortName=new SortStudentBasedOnName();
            System.out.println("Sorted students based on name");

            Collections.sort(slist,sortName);
            
            //Display student data after sorting by name
            
            Iterator<Student2>sobj=slist.iterator();//display coloums and rows
            
            System.out.println("Student id\t\tStudent Name\tStudent fees");
            
            while(sobj.hasNext()) {
            	Student2 s=sobj.next();
            	System.out.println(s.studentid+"\t\t"+s.studentname+"\t"+s.studentfees);
            }
            
      }

}