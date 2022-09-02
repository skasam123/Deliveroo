// Superclass
class Base {    
    public static void display() {
        System.out.println("Display Superclass");
    }      
    public void print()  {
         System.out.println("Print superclass");
    }
}
 
// Subclass
class Derived extends Base {  
	public static void display() {
         System.out.println("Display subclass");
    } 
    public void print() {
         System.out.println("print subclass");
   }
}
// Driver class
public class test {
    public static void main(String args[ ])  {
    	double a = 111.8329382983289;
    	String aa = "asas";
    	System.out.println("line" + a);
    	Base obj1 = new Derived();     
       obj1.display(); 
       obj1.print();    
    }
}