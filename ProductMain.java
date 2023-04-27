import java.util.ArrayList;
import java.util.Iterator;

class Product{
	//instance vars
	 int pid;
	 String pname;
	 float pprice;
	//generate constructor with args
	public Product(int pid, String pname, float pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		
		}
// generate toString 
	//display the details
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice
				 +"]";
	}

}
public class ProductMain {

	public static void main(String[] args) {
		
            Product p1=new Product(1,"TV", 37865);
            Product p2=new Product(2,"PC", 56865);
           Product p3=new Product(3,"Phone", 38365);
            Product p4=new Product(4,"Laptob", 78625);
           //add product objects to ArrayList
            //ArrayList for user defined datatype
            ArrayList<Product> plist=new ArrayList<Product>();
            plist.add(p1);
            plist.add(p2);
            plist.add(p3);
            plist.add(p4);
            //display
            System.out.println(plist);
            
            //Using Iterator
            Iterator<Product>pit=plist.iterator();
            //display
            System.out.println("Product ID\tProduct Name\t\tProduct Price");
            while(pit.hasNext()) {
            	//hasNest()--Returns true if the iteration has more elements.
          Product p=pit.next();//User defined datatype for all p1...p4
            System.out.println(p.pid+"\t\t"+p.pname+"\t\t\t"+p.pprice);
            }
      }

}

