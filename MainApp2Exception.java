
public class MainApp2Exception {

	public static void main(String[] args) {
		int a=10,b=2,c=0 ;
		int arr[]=new int[5];
		System.out.println("Before Operation");
		try {
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		try {
			arr[6]=7;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("After operation");
		System.out.println("c="+c);
		System.out.println("arr[3]="+arr[3]);

	}

}
