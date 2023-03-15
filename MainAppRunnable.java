class MyClass1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method"+Thread.currentThread());
	}
}
public class MainAppRunnable {

	public static void main(String[] args) {
		MyClass1 ob1=new MyClass1();
		Thread t1=new Thread(ob1);
		MyClass1 ob2=new MyClass1();
		Thread t2=new Thread(ob1);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
		
		

	}

}
