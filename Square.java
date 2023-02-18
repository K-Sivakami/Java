import java.util.Scanner;
public class Square {
public static void main(String args[])
{
	int area,side;
	Scanner sc=new Scanner(System.in);
	side=sc.nextInt();
	area=side*side;
	System.out.println("Area of a Square is:"+area);
}
}
