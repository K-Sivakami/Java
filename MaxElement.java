import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		int sum=0;
		int a[]=new int[5];
		int max=a[0];//lets assume
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();  //accept array elements
		}

		System.out.println("Array Elements are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);//display those elements
		}
		//fine sum of all array elements
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		//max
		for(int i=1;i<=a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximun element is:"+max);
		//minimum element 
		
				int min=a[0];
				for(int i=1;i<a.length;i++) {
					if(a[i]<min) {
						min=a[i];
					}
				}
				System.out.println("Minimum element is  "+min);
				
	
	}

}
