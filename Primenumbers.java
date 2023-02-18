
public class Primenumbers {

	public static void main(String[] args) {
		int count=0,n=0;
		for(int i=1;i<=100;i++)//1 23...100
		{
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
				{
					count+=1;
					
				}
			}
		
		if(count==2) 
		{
			n++;
         System.out.print(i+" ,");
         System.out.print(n);
		}
	}
	}
}
