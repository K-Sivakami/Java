
public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getChars()
				String s="edubridge india pvt ltd";
				char ch[]=new char[10];
				
				s.getChars(10, 15, ch, 0);
				System.out.println("Extracted string="+ch);
				
				for(int i=0;i<ch.length;i++) {
					System.out.print(ch[i]);
				}
				//b=new StringBuffer(s);
				//or
				StringBuilder b=new StringBuilder(s); //thread safe
				
				//b.reverse();
				//System.out.println("Reversed string is "+b);
				b.append("Bangalore");
				System.out.println("after append the string is "+b);
				
				b.insert(4, "Hello");
				System.out.println("after insert "+b);
				
				b.delete(4, 15);
				System.out.println("after delete "+b);
				
				
				
	}

}
