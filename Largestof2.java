import java.util.Scanner;
public class Largestof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       if(a>b)
       {
    	   System.out.println("The largest of "+a+" and "+b+" is :"+a);
       }
       else
       {
    	   System.out.println("The largest of "+a+" and "+b+" is :"+b);
       }
	}

}
