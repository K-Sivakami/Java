import java.util.Scanner;

class Empdetailsinfo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
       String ename;
       int eid;
       float esalary;
       void inputdata() {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter employee name:");
    	   ename=sc.next();
    	   System.out.println("Enter employee id:");
    	   eid=sc.nextInt();
    	   System.out.println("Enter employee salary:");
    	   esalary=sc.nextFloat();
    	   
       }
	void display() {
		//public static void main(String args[]) 
		System.out.println(ename);
		System.out.println(eid);
		System.out.println(esalary);
	}
}
public class Empdetails {
	
public static void main(String args[]) {
	Empdetailsinfo obj=new Empdetailsinfo();
	obj.inputdata();
	obj.display();
}
}
