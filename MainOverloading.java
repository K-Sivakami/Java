import java.util.Scanner;
class Main{
	void display() {
		System.out.println("Method with No argument");
	}
	void display(int i){
		 System.out.println("Method with One integer argument "+i);
		}
	void display(float i){
		 System.out.println("Method with One float argument "+i);
	}
	void display(double i){
		 System.out.println("Method with One double argument"+i);
		}
	void display(int i, int j){
		 System.out.println("Method with two integer argument "+i +" and "+j);
		}
	void display(float i, float j){
		 System.out.println("Method with two float argument "+i +" and "+j);
		}
	void display(double i, double j){
		 System.out.println("Method with two double argument "+i +" and "+j);
		}
	void display(int i, float j){
		 System.out.println("Method with one integer and one  float argument "+i+ " and "+j);
		}
	void display(int i, double j){
		 System.out.println("Method with one integer and one double argument "+i +" and "+j);
		}
}
public class MainOverloading {

	public static void main(String[] args) {
		Main obj=new Main();
		obj.display();
		obj.display(5);
		obj.display(3.14f);
		obj.display(67.89);
		obj.display(3.14f,6.7f);
		obj.display(34.56,67.89);
		obj.display(5,8.9f);
		obj.display(7,89.00);

	}

}
