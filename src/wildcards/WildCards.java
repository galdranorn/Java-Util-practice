
package wildcards;

import java.util.ArrayList;
import java.util.List;

class SuperClass {
    // "?" to wildcard - znak wieloznaczności w informatyce
    // "? extends ... to bounded wildcard
    public static void tester (List<? extends SuperClass> srcList) {
        
    }
    
}
class SubClass extends SuperClass {
    
}

public class WildCards {
    
    public static void main(String[] args) {
        
        List<String> strList = new ArrayList<String>();
        
        List<SuperClass> classList = new ArrayList<SuperClass>();
        classList.add(new SuperClass());
        classList.add(new SubClass());
        
        SuperClass.tester(classList);
        // SuperClass.tester(strList); // error, because of generic types 
        
    }
    
}
