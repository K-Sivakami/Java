import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//ArrayList<Integer> obj=new ArrayList<>();
		LinkedList<Integer> obj=new LinkedList<>();
        for(int i=1;i<=10;i++)
        {
        	obj.add(i);
        }
        obj.add(100);
        obj.add(4,99);
        System.out.println(obj);
        obj.remove(5);
        System.out.println(obj);
        System.out.println("Size of ArrayList "+obj.size());
        System.out.println("Chect 99 present or not in a list "+obj.contains(99));
	}

}
