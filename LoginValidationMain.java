import java.util.Scanner;
public class LoginValidationMain {

	public static void main(String[] args) {
		String uname,upass;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and password :");
		uname=sc.next();
		upass=sc.next();
		if(uname.equalsIgnoreCase("sivakami") && upass.equals("siva1234"))
		{
			System.out.println("Valid user");
		}
		else
		{
			System.out.println("Not valid");
		}
	}

}
