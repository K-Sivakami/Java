import java.util.Scanner;

		class Addition{
			
			void add(int i, int j) {
				int sum;
				sum=i+j;
				System.out.println("Sum of two integer values="+sum);
			}
			void add(float i, float j) {
				float sum;
				sum=i+j;
				System.out.println("Sum of two float values="+sum);
			}
			void add(double i, double j) {
				double sum;
				sum=i+j;
				System.out.println("Sum of two double values="+sum);
			}
		}

		public class MainAppOverloading {

			public static void main(String[] args) {
				Addition aob=new Addition();

				aob.add(8, 6);
				aob.add(5.6f, 2.3f);
				aob.add(45.3, 23.2);
				/*void display(){
   Syso("No arg display");
}
void display(int i){
 Syso("one int arg "+i);
}

void display(float i){
 Syso("one float arg "+i);
}
void display(double i){
 Syso("one double arg "+i);
}
void display(float i, float j){
 Syso("two float arg "+i +" and "+j);
}

void display(int i, float j){
 Syso("one int and one  float arg "+i+ " and +j);
}
*/
	}

}
