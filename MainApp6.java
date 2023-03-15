
public class MainApp6 {

	public static void main(String[] args) {
		
				int a=10, b=2,c=0;
				int ar[]=new int[5];
				System.out.println("Before Operation");
				try {
				c=a/b; //division
				ar[10]=12;
				
				}catch(ArithmeticException  e) {
					e.printStackTrace();
				}
				catch(Exception e) {
					e.printStackTrace();
					}
				
				finally {
					System.out.println("Fnally block will executes always");
					System.out.println("used for resource closing");
				}
				System.out.println("After operation");
				System.out.println("c="+c);
				System.out.println("ar[3]="+ar[3]);
				}
	
}
