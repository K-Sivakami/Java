import java.util.Scanner;

public class movieMagic {
int year;
String title;
float rating;
movieMagic()
{
	year=0;
	title="";
	rating=0.0f;
	
}
void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Movie name:");
	title=sc.nextLine();
	System.out.println("Enter movie year:");
	year=sc.nextInt();
	System.out.println("Enter the movie rating:");
	rating=sc.nextFloat();
}
void rating() {
	if(rating>=0.0 && rating<=2.0)
	{
		System.out.println(title+" movie is Flop");
	}
	else if(rating>=2.1 && rating<=3.4)
	{
		System.out.println(title+" movie is Semi-Hit");
	}
	else if(rating >=3.5 && rating<=4.5)
	{
		System.out.println(title+" movie is Hit");
	}
	else if(rating>=4.6 && rating <=5.0)
	{
		System.out.println(title+" movie is Super-Hit");
	}
}

	public static void main(String[] args) {
		movieMagic mobj=new movieMagic();
mobj.accept();
mobj.rating();

	}

}
