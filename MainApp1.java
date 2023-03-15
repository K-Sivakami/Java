package com.java1;
class A1{
	int pnum;
	//costructor with args[]
	A1(int j){
		pnum=j;
		System.out.println("parent class constructor");
		
	}
}
class B1 extends A1{
	int cnum,sum;
	B1(int i,int j){
		super(j);
		cnum=i;
		System.out.println("Child class constructor");
		
	
	}
	void sum()
	{
		sum=pnum+cnum;
	}
	void display()
	{
		System.out.println("sum="+sum);
	}
}
public class MainApp1 {
public static void main(String[] args) {
				B1 bobj=new B1(10,30);
				bobj.sum();
				bobj.display();

	}

}
