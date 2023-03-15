package pack;

public class Employee {

	int eid;
	String ename;
	 public Employee(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;

	}
	 public void empDisplay() {
		   System.out.println("Employee id "+eid);
		   System.out.println("Employee name "+ename);
	   }
	
}
