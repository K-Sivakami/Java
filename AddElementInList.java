import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddElementInList {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<>();
	     obj.add(1);
	     obj.add(2);
	     obj.add(21);
	     obj.add(33);
	     obj.add(1);
	     obj.add(2);
	     obj.add(2);
	     Collections.sort(obj);
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the Element:");
	     int ele=sc.nextInt();
	     System.out.println("Enter the position:");
	     int position=sc.nextInt();
	     for(int i=0;i<=obj.size();i++)
	     {
	    	 if(position==i)
	    	 {
	    		 obj.add(ele);
	    	 }
	    		
	     }
        System.out.println(obj);
	}
}



