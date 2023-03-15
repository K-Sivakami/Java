import java.util.Scanner;
public class Countwords {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char ch;
		int wc=0;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch==' ' )
			{
				wc=wc+1;
			}
			wc++;
		}
		System.out.println("Words count:"+wc);


	}

}
