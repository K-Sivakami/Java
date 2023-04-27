import java .util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Iterator;

class Employee2{
	int eid;
	String ename;
	float esalary;
	int eage;
	public Employee2(int eid, String ename, float esalary,int eage) {
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
   class SortEmployeeId implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		if(o1.esalary>o2.esalary)
			return 1;
		if(o1.esalary<o2.esalary)
			return -1;
		else
		return 0;
	} 
   }
   class SortEmployeeSalary implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		if(o1.esalary>o2.esalary)
			return 1;
		if(o1.esalary<o2.esalary)
			return -1;
		else
		return 0;	}
	   
   }
   class SortEmployeeName implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		return o1.ename.compareTo(o2.ename);
	}
	   
   }


	
	
}
public class SortEmployeeMain {

	public static void main(String[] args) {
		
            Employee2 e1=new Employee2(1,"Manoj", 7865.4f,25);
            Employee2 e2=new Employee2(2,"Raju", 6865.4f,26);
            Employee2 e3=new Employee2(3,"Praveen", 78365.4f,27);
            Employee2 e4=new Employee2(4,"shiva", 78625.4f,29);
           
            //ArrayList for user defined datatype
            ArrayList<Employee2> elist=new ArrayList<Employee2>();
            elist.add(e1);
            elist.add(e2);
            elist.add(e3);
            elist.add(e4);
            
            System.out.println(elist);
            
            //Using Iterator
            Iterator<Employee2>eit=elist.iterator();
            
            System.out.println("Employee ID\tEmployee Name\tEmployee salary\tEmployee age");
            while(eit.hasNext()) {
           Employee2 e=eit.next();
            System.out.println(e.eid+"\t\t"+e.ename+"\t\t"+e.esalary+"\t\t"+e.eage);
            }
      }

}

