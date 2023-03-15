interface productin{
	void m1();//public abstract void m1()

default void m2()
{
	System.out.println("default method java 8 feature");
}
public static void staticm() {
	System.out.println("Static method");
}
}

public class Java8_Interface implements productin {

	public static void main(String[] args) {
		Java8_Interface obj=new Java8_Interface();
		obj.m1();
		obj.m2();
		productin.staticm();

	}

	@Override
	public void m1() {
		System.out.println("ProductInterface m1");
	}

}
