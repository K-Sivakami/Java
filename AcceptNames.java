import java.util.Scanner;

public class AcceptNames {

	public static void main(String[] args) {
		
		String name[];int size;
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		name=new String[size];
		
		System.out.println("Enter array Elements");
		for(int i=0;i<name.length;i++) {
			name[i]=sc.next();  
		}

		System.out.println("Array Elements are");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}

	}

}
