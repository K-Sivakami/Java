import java.util.ArrayList;

public class CopyArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];//dynamic array
        //create a array of same size as arraylist
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }
        ArrayList<Integer>l1=new ArrayList<Integer>();
        l1.add(9);//Integer
        l1.add(8);
      /* Integer ar[]=new Integer[l1.size()];//only work with wrapper class
        l1.toArray(ar);
        int s=0;
        for(int i=0;i<ar.length;i++) {
        	s=s+ar[i];
        	System.out.println(s);
        	}*/
       
	}

}
