import java.util.Scanner;
public class ElectricBill {
String n;
int units;
double bill;
double surcharge;
void Accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the customer:");
	n=sc.nextLine();
	System.out.println("Enter no.of units");
	units=sc.nextInt();
}
void calculate() {
	if(units<=100)
	{
		bill=units*2.0;
	}
	else if(units>100 && units<=300)
	{
		bill=100*2.0+units*3.00;
	}
	else if(units>300)
	{
		bill=100*2.0+200*3.00+units*5.00;
	
	surcharge=(bill*2.5)/100;
	bill=bill+surcharge;
	}
}
void print() {
	System.out.println("Name of the customer:"+n);
	System.out.println("Number of units consumed:"+units);
	System.out.println("Bill amount:"+bill);
}
	public static void main(String[] args) {
		ElectricBill eobj=new ElectricBill();
		eobj.Accept();
		eobj.calculate();
		eobj.print();

	}

}
