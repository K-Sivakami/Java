import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new  int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array Elements");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();  //accept array elements
}
for(int i=a.length-1;i>=0;i--) {
	System.out.println(a[i]);//display those elements
}
	}

}
