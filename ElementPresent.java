import java.util.ArrayList;
import java.util.Scanner;

public class ElementPresent {

	public static void main(String[] args) {
		 ArrayList<Integer> obj=new ArrayList<>();
	     obj.add(1);
	     obj.add(2);
	     obj.add(21);
	     obj.add(33);
	     obj.add(1);
	     obj.add(2);
	     obj.add(2);
	     
	     System.out.println("Enter the Element");
	     Scanner sc=new Scanner (System.in);
	     int c=0;
	     int n=sc.nextInt();
	    for(int i:obj )
	    {
	    if(n==i)
	     c++;
	    }
	    System.out.println(c);
	    
	    
	    }
	}


