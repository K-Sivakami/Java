package com.java1;

class Employee1{
	 int eid;
	 String ename;
	 static String cname;
	 static {  //static block used  to initialize static data
		 cname="EdubridegIndia Pvt.ltd";
	 }
	Employee1(){
		System.out.println("Employee ");
	}
	 public Employee1(int eid, String ename) {
		 this.eid=eid;
		 this.ename=ename;
		
	}
	void display() {
		System.out.println("Employee id="+eid);
		System.out.println("Employee Name="+ename);
		System.out.println("Employee company Name="+cname);
	}
	
	static void myStaticMethod() {
		System.out.println("Static method can access only static data");
		System.out.println("Employee company Name="+cname);
	}
}

public class Static {

	public static void main(String[] args) {
		Employee1 eob1=new Employee1(1111,"Mohanapriya");
		Employee1 eob2=new Employee1(1112,"Rahul");
		Employee1 eob3=new Employee1(1113,"Viswa");
	    eob1.display();
		eob2.display();
		eob3.display();
		//eob1.myStaticMethod();
		Employee1.myStaticMethod();
		
		
	}

}