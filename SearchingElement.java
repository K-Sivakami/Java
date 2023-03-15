import java.util.Scanner;

public class SearchingElement {

	public static void main(String[] args) {
		int a[]=new int[5];
		int searchele,pos=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Elements");
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();  //accept array elements
		}
		System.out.println("Enter the element to search:");
		searchele=sc.nextInt();
		
        for(int i=0;i<a.length;i++)
        {
        	if(searchele==a[i]) {
        		pos=i;
        		break;
        	}
        }
        if(pos>-1)
        {
        System.out.println("Search is successfull");
        System.out.println(searchele+" present at position "+(pos+1));
        }
        else {
        	System.out.println("Search is Unsuccessfull");
            System.out.println(3+" not found in a given array ");
        }
	}

}
