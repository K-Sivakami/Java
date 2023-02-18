import java.util.Scanner;


	
		
class Bank{
	   double amount;
	   Bank(){
		   amount=1000;
	   }
	   void deposit(double damount){
	      amount=amount+damount;
	      System.out.println("Balance after deposit="+amount);
	  }
	  void withdraw(double wamount){
	       //check the condition
	      if(wamount<amount){
	          amount=amount-wamount;
	          System.out.println("After withdraw Balance amount="+amount);
	      }
	else
	     {
	            System.out.println("Insufficient Balance");
	    }

	}

	void  display(){
	     System.out.println("Balance amount="+amount);
	}
}

public class BankMainApp {

	public static void main(String[] args) {
		double damount,wamount;
		char option;
		Bank bobj=new Bank();
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bank Application");
		System.out.println("1.Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3.Display Balance");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:System.out.println("Enter amount to deposit");
		       damount=sc.nextDouble();
		       bobj.deposit(damount);
		       break;
		case 2:System.out.println("Enter amount to withdraw");
	       wamount=sc.nextDouble();
	       bobj.withdraw(wamount);
	       break;
		case 3: System.out.println("Display Bank Balance ");
		         bobj.display();
		     break;
		default: System.out.println("Invalid input");
		}
		System.out.println("Do you want to press any key to continue and n to stop");
		option=sc.next().charAt(0);
		}
		while(option!='n');
		System.out.println("Program is terminated");
	

}




	

}
