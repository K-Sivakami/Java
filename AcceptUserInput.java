import java.util.Scanner;
public class AcceptUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
int sum=0;float avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array Elements");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();  //accept array elements
}

System.out.println("Array Elements are");
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);//display those elements
}
//fine sum of all array elements
for(int i=0;i<a.length;i++)
{
	sum=sum+a[i];
}
System.out.println(sum);
//average
avg=(float)sum/a.length;
System.out.println("Average: "+avg);


	}

}
