import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student5{
	int sid;
	int sage;
	float sfees;
	String sname;

	public Student5(int sid,int sage,  float sfees, String sname) {
		super();
		this.sid = sid;
		this.sage=sage;
		this.sfees = sfees;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sfees=" + sfees + ", sname=" + sname + "]";
	}
	
	
}
class SortStudentFees1 implements Comparator<Student5>{

	@Override
	public int compare(Student5 o1, Student5 o2) {
		if(o1.sfees>o2.sfees)
			return 1;
		if(o1.sfees<o2.sfees)
			return -1;
		else
		return 0;
	}
	
}
class SortStudentBasedId1 implements Comparator<Student5>{

	@Override
	public int compare(Student5 o1, Student5 o2) {
		if(o1.sid>o2.sid) 
			return 1;
		else if(o1.sid<o2.sid)
			return -1;
		else 
			return 0;
	}
	
}
class SortAge implements Comparator<Student5>{

	@Override
	public int compare(Student5 o1, Student5 o2) {
		if(o1.sage>o2.sage) 
			return 1;
		else if(o1.sage<o2.sage)
			return -1;
		else 
			return 0;
	}
	
}

public class StudentTreeSet {

	public static void main(String[] args) {
		Student5 s1=new Student5(1,22, 7865.4f,"Manoj");
        Student5 s2=new Student5(4,23, 8865.4f,"Kiran");
        Student5 s3=new Student5(2,24, 17865f,"Swetha");
        Student5 s4=new Student5(3,25, 9865.4f,"Praveen");
        
        //Treeset for user defined datatype
        System.out.println("Based on Age:");
        TreeSet<Student5> sobj2=new TreeSet<Student5>(new SortStudentFees1());
        sobj2.add(s1);
        sobj2.add(s2);
        sobj2.add(s3);
        sobj2.add(s4);
        
        System.out.println(sobj2);
        //Based on fees
        System.out.println("Based on Fees:");
        TreeSet<Student5> sobj=new TreeSet<Student5>(new SortStudentFees1());
        sobj.add(s1);
        sobj.add(s2);
        sobj.add(s3);
        sobj.add(s4);
        
        System.out.println(sobj);
        System.out.println("Based on Id:");
        //Based on Id
        TreeSet<Student5> sobj1=new TreeSet<Student5>(new SortStudentBasedId1());
        sobj1.add(s1);
        sobj1.add(s2);
        sobj1.add(s3);
        sobj1.add(s4);
       
        System.out.println(sobj1);
        //Using iterrator
        Iterator<Student5> sit=sobj1.iterator();
        
        System.out.println("Student ID\tStudentName\tStudent Fees");
        while(sit.hasNext()) {
        Student5 s=sit.next();
        System.out.println(s.sid+"\t\t"+s.sname+"\t\t"+s.sfees);
        }
        
        
        
  
	}

}
