import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<>();
        obj.add(98);
        obj.add(56);
        obj.add(78);
        obj.add(45);
        System.out.println(obj);
        //for each loop 
        for(Integer val : obj)
        {
        	System.out.println(val);
        }
        // using iterator interface
        Iterator<Integer> itob=obj.iterator();
        while(itob.hasNext())
        {
        	System.out.println(itob.next());
        }
        ArrayList<Float>obj1=new ArrayList<>();
        obj1.add(98.4f);
        obj1.add(56.9f);
        obj1.add(78.6f);
        obj1.add(45.5f);
        System.out.println(obj1);
        //for each loop 
        for( float val : obj1)
        {
        	System.out.println(val);
        }
        // using iterator interface
        Iterator<Float> itob1=obj1.iterator();
        while(itob1.hasNext())
        {
        	System.out.println(itob1.next());
        }
        ArrayList<String>obj3=new ArrayList<>();
        obj3.add("Subha");
        obj3.add("Vasu");
        obj3.add("Kamali");
        obj3.add("Raju");
        System.out.println(obj3);
        //for each loop 
        for(String val3 : obj3)
        {
        	System.out.println(val3);
        }
        // using iterator interface
        Iterator<String> itob3=obj3.iterator();
        while(itob3.hasNext())
        {
        	System.out.println(itob3.next());
        }
	}

}
