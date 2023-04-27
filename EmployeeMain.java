
import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	int eid;
	String ename;
	float esalary;
	int eage;
	public Employee(int eid, String ename, float esalary,int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.eage=eage;
		}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary
				+ ", eage=" +eage +"]";
	}



	
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		
            Employee e1=new Employee(1,"Manoj", 7865.4f,25);
            Employee e2=new Employee(2,"Raju", 6865.4f,26);
            Employee e3=new Employee(3,"Praveen", 78365.4f,27);
            Employee e4=new Employee(4,"shiva", 78625.4f,29);
           
            //ArrayList for user defined datatype
            ArrayList<Employee> elist=new ArrayList<Employee>();
            elist.add(e1);
            elist.add(e2);
            elist.add(e3);
            elist.add(e4);
            
            System.out.println(elist);
            
            //Using Iterator
            Iterator<Employee>eit=elist.iterator();
            
            System.out.println("Employee ID\tEmployee Name\tEmployee salary\tEmployee age");
            while(eit.hasNext()) {
           Employee e=eit.next();
            System.out.println(e.eid+"\t\t"+e.ename+"\t\t"+e.esalary+"\t\t"+e.eage);
            }
      }

}
