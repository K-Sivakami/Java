import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
	int	n,Ldigit,rev=0,copynum=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	n=sc.nextInt();
	copynum=n*1;
	while(n!=0)
	{
		Ldigit=n%10;
		rev=rev*10+Ldigit;
		n=n/10;
	}
	System.out.println(rev);
	
	if(rev==copynum) {
		System.out.println("Given num is palindromme");
		
	}
	else {
		System.out.println("Given num is not palindrome");
	}
	
	
	}

}
