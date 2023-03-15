import java.util.Scanner;
public class ShowRoom {
    String name;
    long mobileno;
    double cost;
    double discount;
    double amount;
    ShowRoom(){
    	name="";
    	mobileno=0;
    	cost=0;
    	discount=0;amount=0;
    			
    }
    void input() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter customer name:");
    	name=sc.nextLine();
    	System.out.println("Enter mobile number:");
    	mobileno=sc.nextLong();
    	System.out.println("Enter the cost:");
    	cost=sc.nextDouble();
    	
    }
    void calculate() {
    	if(cost<=10000)
    	{
    		discount=(cost*5)/100;
    	}
    	else if(cost>10000 && cost<=20000)
    	{
    		discount=(cost*10)/100;
    		
    	}
    	else if(cost>20000 && cost<=35000)
    	{
    		discount=(cost*15)/100;
    }
    	else if(cost>35000)
    	{
    		discount=(cost*20)/100;
    	}
    	amount=cost-discount;
    }
    void display() {
    	System.out.println("Customer name="+name);
    	System.out.println("Customer mobile no="+mobileno);
    	System.out.println("Amount to be paid after discount="+amount);
    }
	public static void main(String[] args) {
		ShowRoom sobj=new ShowRoom();
		sobj.input();
		sobj.calculate();
		sobj.display();
	
	}

}
