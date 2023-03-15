import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char ch;
		int vc=0;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch=='a' || ch=='e'||ch=='o'||ch=='i'||ch=='u')
			{
				vc=vc+1;
			}
			
		}
		System.out.println("Vowel count:"+vc);

	}

}
