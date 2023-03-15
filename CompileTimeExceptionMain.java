import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CompileTimeExceptionMain {

	public static void main(String[] args)  {
		String name="";
		int age=0;
		float salary=0;
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//or
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		try {
		System.out.println("Enter name");
		name=br.readLine();
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter salary");
		salary=Float.parseFloat(br.readLine());
		}
		catch (IOException e){
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Salary="+salary);
		}

	}

}
