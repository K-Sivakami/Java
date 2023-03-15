
public class ExceptionMain2 {

	public static void main(String[] args) {
		int a[]=new int[5];
		try {
		a[6]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("After array initialization"+a[4]);
    
	}

}
