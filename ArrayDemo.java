
public class ArrayDemo {

	public static void main(String[] args) {
		//declare an array
		int stu[];
		stu=new int[5];
		
		stu[0]=10;
		
		stu[1]=11;
		stu[2]=12;
		stu[3]=13;
		stu[4]=14;
		//int stu[]={10,11,12,13,14,15}; in one line you can initialise,declare values to variables.
		
		System.out.println("Array elements are");
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i]);
	}
	}

}
