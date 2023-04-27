import java.util.ArrayList;
import java.util.Iterator;

class Product1{
	//instance vars
	private int pid;
	 private String pname;
	private float pprice;
	//generate getter and setter
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPprice() {
		return pprice;
	}
	public void setPprice(float pprice) {
		this.pprice = pprice;
	}
	// generating toString()
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	

}
public class ProductMainApp {

	public static void main(String[] args) {
		
            Product1 p1=new Product1();
            Product1 p2=new Product1();
            p1.setPid(1);
    		p1.setPname("TV");
    		p1.setPprice(37654.34f);
    		
    		p2.setPid(2);
    		p2.setPname("Laptop");
    		p2.setPprice(86654.34f);
           //add product objects to ArrayList
            //ArrayList for user defined datatype
            ArrayList<Product1> plist=new ArrayList<Product1>();
            plist.add(p1);
            plist.add(p2);
           
            //display
            System.out.println(plist);
            
            //Using Iterator
            Iterator<Product1>pit=plist.iterator();
            //display
            System.out.println("Product ID\tProduct Name\t\tProduct Price");
            while(pit.hasNext()) {
            	//hasNest()--Returns true if the iteration has more elements.
          Product1 p=pit.next();//User defined datatype for all p1...p4
            System.out.println(p.getPid()+"\t\t"+p.getPname()+"\t\t\t"+p.getPprice());
            }
      }

}


