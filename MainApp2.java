package com.java1;
class A2{   //Parent class or super class
    int pnum;
    A2(int pnum){
    	this.pnum=pnum; //this is a keyword, it refers to present object
    	System.out.println("Parent class constructor");
        pnum=10;
   }
}
class B2 extends A1{ //B is child class of A
    int cnum,sum;
    B2(int i, int j){
    	super(j); //to call parent class constructor from child class
    	          //use super key word, and super word should be first
    	          //line in child class
    	cnum=i;
    	System.out.println("child class constructor");
           
      }
   void sum()
   {
     sum=pnum+cnum;
     }
   void display(){
          System.out.println("sum="+sum);
   }
} 
public class MainApp2{
     public static void main(String args[]){
         B2 ob=new B2(10,20);
          ob.sum();
         ob.display();
    }
}
