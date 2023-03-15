import java.util.Scanner;
//copy constructor
public class CopyConstructor{
	String name;
	int eid;
	
	public CopyConstructor(String name,int eid) {
		this.name=name;
		this.eid=eid;
		
		}
		CopyConstructor(CopyConstructor c1)
		{
			name=c1.name;
			eid=c1.eid;
		}
	 	void display() {
		System.out.println("Name="+name);
		System.out.println("Id="+eid);
	}
		public static void main(String[] args) {
		CopyConstructor c1=new CopyConstructor("Sivakami",678);
		CopyConstructor c2=new CopyConstructor(c1);
		c1.display();
		c2.display();

	}

}
