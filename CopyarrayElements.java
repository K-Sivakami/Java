import java.util.Scanner;

public class CopyarrayElements {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();  //accept array elements
		b[i]=a[i];// for copy
		}
		
		System.out.println("Element in b array");
		for(int i=0;i<a.length;i++) {
			
			System.out.println(b[i]);//display those elements
		}

	}

}
