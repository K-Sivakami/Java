import java.util.Scanner;

class BankBalance extends Exception{
	public BankBalance(String s){
		super(s);
	}
}
class Bank{
	float balance;
	public Bank(){
	  balance=10000;
	}
	public void withdraw (float wamt) {
		try {
			if(wamt>balance) {
				throw new BankBalance("Insufficient amount");
			}
			else {
				balance=balance-wamt;
				System.out.println("Balance after withdraw:"+balance);
			}
		}
		catch(BankBalance e){
			e.printStackTrace();
		}
		}
	

public class BankMain {

	public static void main(String[] args) {
		Bank bob=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdraw amount");
		float wamt=sc.nextFloat();
		
		bob.withdraw(wamt);
	}

}}

