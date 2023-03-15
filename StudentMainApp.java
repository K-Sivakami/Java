import java.util.Scanner;
class Student{
	int sid;
	String sname;
	float sfees,tfees=0;
	
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		sname=sc.nextLine();
		System.out.println("Enter Student id:");
		sid=sc.nextInt();
		System.out.println("Enter Student Fees:");
		sfees=sc.nextFloat();
		
		
	}
	void display() {
		System.out.println("Name="+sname);
		System.out.println("id="+sid);
		System.out.println("Fees "+sfees);
		System.out.println("Total fees:"+(tfees+=sfees));
	}
}

public class StudentMainApp {

	public static void main(String[] args) {
		/*Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		
		s1.inputData();
		s2.inputData();
		s3.inputData();
		s4.inputData();
		s5.inputData();
		
		System.out.println("All student details");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();*/
		
Student stu[]=new Student[5];
for(int i=0;i<stu.length;i++)
{
	stu[i]=new Student();
}
for(int i=0;i<stu.length;i++)
{
	stu[i].inputData();
}
	System.out.println("All student details:");
	for(int i=0;i<stu.length;i++)
	{
		stu[i].display();
	}
 

	}

}
