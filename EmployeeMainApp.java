import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee1{
	//instance variables
	private int eid;
	private String ename;
	private float esalary;
	
	//generate setter and getter methods
		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public float getEsalary() {
			return esalary;
		}

		public void setEsalary(float esalary) {
			this.esalary = esalary;
		}
		
	
	
	//generate tostring
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}

public class EmployeeMainApp {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1();
  
		e1.setEid(1);
		e1.setEname("Sivakami");
		e1.setEsalary(7654.34f);
		
		e2.setEid(2);
		e2.setEname("Subhashini");
		e2.setEsalary(8654.34f);
		
   
   //add employee objects to arraylist
  List<Employee1>elist=new ArrayList<Employee1>();
  
  
  elist.add(e1);
  elist.add(e2);
 
 
  //display
  System.out.println(elist);
  
  //using Iterator
  
  Iterator<Employee1>eit=elist.iterator();
  
  System.out.println("Employeeid\tEmployeeName\tEmployeeSalary");
  System.out.println("___________________________________________");
  
  while(eit.hasNext()) {
	 Employee1 eob= eit.next();
	 System.out.println(eob.getEid()+"\t\t"+eob.getEname()+"\t"+eob.getEsalary());
   }
  
  }

}