
public class MainAppException {

	public static void main(String[] args) {
		int a=10;int b=0;int c=0;
		System.out.println("Before division");
		try {
		c=a/b;//runtime error
		}
		catch(ArithmeticException e)
		{
			  e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("worked");
		}
		System.out.println("c="+c);
		System.out.println("After execution");
		
	}

}
