class MyClass3 extends Employee implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
		System.out.println("Run method "+Thread.currentThread());
		try {
			System.out.println("inside sleep method:");
			Thread.sleep(500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
public class Thread_Sleep {
	public static void main(String[] args) throws InterruptedException {
		MyClass3 ob1=new MyClass3();
		Thread tob1=new Thread(ob1);
		
		MyClass3 ob2=new MyClass3();
		Thread tob2=new Thread(ob1);
		
		tob1.setName("first");
		tob2.setName("second");
		
		tob1.start();
		
		tob1.join();
		tob2.start();
    }
}
