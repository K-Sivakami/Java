interface f1{
	void m1();
}
interface f2{
	void m2();
}
interface f3{
	void m3();
}
abstract class Product implements f1,f2,f3{
	/*public void m1() {
		System.out.println("m1 method");
	}*/
	public void m2() {
		System.out.println("M2 method");
	}
	public void m3() {
		System.out.println("m3 method");
	}
}
class A extends Product{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainApp {

	public static void main(String[] args) {
		A p=new A();
		p.m1();
		p.m2();
		p.m3();

	}

}
