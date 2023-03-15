
public class WrapperClass {

	public static void main(String[] args) {
		

		String num1="45";
		String num2="78";
		int n1,n2,sum;
		n1=Integer.parseInt(num1);
		n2=Integer.parseInt(num2);
		sum=n1+n2;
		System.out.println("sum="+sum);  //123


		String num3="45.3";
		String num4="78.2";

		float f1,f2, s;
		f1=Float.parseFloat( num3);
		f2=Float.parseFloat( num4);

		s=f1+f2;

		double d1,d2, ds;
		d1=Double.parseDouble( num1);
		d2=Double.parseDouble( num2);
		ds=d1+d2;
	}

}
