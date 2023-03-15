class MyClass extends Thread{
	   @Override
	   public void run(){
		   for(int i=1;i<=5;i++)
	        System.out.println("Run method is called "+Thread.currentThread());
	  }
	}
  public class MainAppThread{
	        public static void main(String args[]){
	        System.out.println("JVM Thread "+Thread.currentThread());//main
	         MyClass ob=new MyClass();//2 child thread
	         MyClass ob1=new MyClass();
	         MyClass ob2=new MyClass();
	         ob.setName("firstthread");
	         ob1.setName("secondthread");
	         ob2.setName("thirdthread");
	         System.out.println("Name of first Thread "+ob.getName());
	         System.out.println("Name of Second Thread "+ob1.getName());
	         System.out.println("Name of third Thread "+ob2.getName());
	         
	        ob.start(); //start is also predefined in thread class
	         ob1.start(); //calls the run method
	         ob2.start();
	         
	        


	}

}
