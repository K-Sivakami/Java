class Myclass5 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		System.out.println("Run method is called"+Thread.currentThread());
	}
}



public class MainClass {

	public static void main(String[] args) {
		System.out.println("JVM Thread "+Thread.currentThread());
		Myclass5 ob=new Myclass5();
		Myclass5 ob1=new Myclass5();
		ob.setName("Firstthread");
		ob1.setName("Secondthread");
		ob.start();
		//ob.run();
		ob1.start();
		

	}

}
