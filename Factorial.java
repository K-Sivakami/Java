import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num;int fact=1;
  Scanner sc=new Scanner(System.in);
  num=sc.nextInt();
  for(int i=1;i<=num;i++)
  {
	  fact=fact*1;
  }
  System.out.println("Factorial of "+num+" is "+fact);
	}

}
