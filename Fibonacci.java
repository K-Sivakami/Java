import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f1=1,f2=1,f3,t;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of terms:");
t=sc.nextInt();
System.out.println("Fibbonacci series");
System.out.println(f1);
System.out.println(f2);
for(int i=1;i<=t-2;i++)
{
	f3=f2+f1;
	System.out.println(f3);
	f1=f2;
	f2=f3;
}
	}

}
