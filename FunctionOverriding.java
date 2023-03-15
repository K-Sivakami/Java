package com.java1;
class Parent{
	void display()
	{
		System.out.println("Display method of Parent class");
	}
}
class Child extends Parent{
	void display() {
		super.display();
		System.out.println("Display method of child class");
	}
}
public class FunctionOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child cob=new Child();
cob.display();
	}

}
