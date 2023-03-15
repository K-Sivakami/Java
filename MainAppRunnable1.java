class Employee{
	
}
class MyClass2 extends Employee implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
		System.out.println("Run method "+Thread.currentThread());
	}
	}
}
public class MainAppRunnable1 {
	public static void main(String[] args) throws InterruptedException {
		MyClass2 ob1=new MyClass2();
		Thread tob1=new Thread(ob1);
		
		MyClass2 ob2=new MyClass2();
		Thread tob2=new Thread(ob1);
		
		tob1.setName("first");
		tob2.setName("second");
		
		tob1.start();
		
		tob1.join();//execute orderly
		tob2.start();
    }
}
