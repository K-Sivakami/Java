
public class MainAppString {

	public static void main(String[] args) {
		String name="Hello java";
		System.out.println("No.of characters="+name.length());
		System.out.println("Uppercase :"+name.toUpperCase());
		System.out.println("Lowercase:"+name.toLowerCase());
		System.out.println("Check Hello "+name.indexOf("Hello"));
		System.out.println("Hello occurrance "+name.lastIndexOf("Hello"));
		String s="Hell";
		String s1="Hello";
		String s2="Hello";
		String s3="Java";
		System.out.println(s1.equals(s2));
		System.out.println(s.equals(s1));
		String s4=new String("Java");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s.compareTo(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s));

	}

}
