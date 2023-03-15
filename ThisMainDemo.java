package com.java1;
//Program to demonstrate this keyword.
//this keyword refers to present object


class Product1{
	int pid;
	String pname;
	Product1(int pid, String pname){ //pid=1111  pname="Samsung TV
		this(pid);
		System.out.println("Two argument constructor");
		this.pname=pname;
	}
	Product1(int pid){
		this.pid=pid;
		System.out.println("One argument constructor");
	}
	
	void display() {
		System.out.println("Product id="+pid);
		System.out.println("Product name="+pname);
	}
}

public class ThisMainDemo {

	
	public static void main(String[] args) {
		Product1 pob=new Product1(1111,"Samsung TV"); //calls two argument constructor
          pob.display();
	}

}
