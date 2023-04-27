import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
     ArrayList<Integer> obj=new ArrayList<>();
     obj.add(1);
     obj.add(2);
     obj.add(21);
     obj.add(33);
     obj.add(1);
           System.out.println(obj);
           LinkedHashSet<Integer> lht=new LinkedHashSet<Integer>(obj);
   		
   		obj.clear();
   		System.out.println(obj);
   		for(Integer i:lht) {
   			obj.add(i);
   		}

   		System.out.println(obj);
         }
   }