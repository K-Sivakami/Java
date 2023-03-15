import java.util.Scanner;
public class RailwayTicket {
String name;
String coach;
long mobileno;
int amt;
int totalamt;
void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name of the customer");
	name=sc.nextLine();
	System.out.println("Enter name of the coach");
	coach=sc.nextLine();
	System.out.println("Enter customer Mobile number");
	mobileno=sc.nextLong();
	System.out.println("Enter the amount");
	amt=sc.nextInt();
}
void update()
{
	if(coach.equals("First_AC"))
	{
		totalamt=amt+700;
		System.out.println("Amount to be paid:"+totalamt);
	}
	else if(coach.equals("Second_AC"))
	{
		totalamt=amt+500;
		System.out.println("Amount to be paid:"+totalamt);
	}
	else if(coach.equals("Third_AC"))
	{
		totalamt=amt+250;
		System.out.println("Amount to be paid:"+totalamt);
	}
	else if(coach.equals("Sleeper"))
	{
		totalamt=amt;
		System.out.println("Amount to be paid: none");
	}
}
void dispaly()
{
	System.out.println("Customer name="+name);
	System.out.println("Customer mobile no="+mobileno);
	System.out.println("Amount to be paid ="+amt);
}

	public static void main(String[] args) {
		RailwayTicket robj=new RailwayTicket();
		robj.accept();
		robj.update();
		robj.dispaly();

	}

}
