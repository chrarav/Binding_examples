package binding.static1;

import java.util.Collection;
import java.util.HashSet;

public class StaticBindingTest {
 
    public static void main(String args[])  {
       Collection c = new HashSet();
       HashSet d = new HashSet();
       StaticBindingTest et = new StaticBindingTest();
       et.sort(c);
       et.sort(d);
     
    }
   
    //overloaded method takes Collection argument
    public Collection sort(Collection c){
        System.out.println("Inside Collection sort method");
        return c;
    }
 
   
   //another overloaded method which takes HashSet argument which is sub class
    public Collection sort(HashSet hs){
        System.out.println("Inside HashSet sort method");
        return hs;
    }
     
}
