package com.java1;
abstract class Shape{
	abstract void area();
	void display() {
		System.out.println("Display method of abstract class");
	}
	 static  void func() {
		System.out.println("static method");
	}
}
class Square extends Shape{

	@Override
	void area() {
		System.out.println("square area");
		
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		//Shape ob=new Shape();//error because of abstract
		Square sob=new Square();
		sob.area();
		sob.display();
		Shape.func();//static method can be called with ref to class
		
		}


}