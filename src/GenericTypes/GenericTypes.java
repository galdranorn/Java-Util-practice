package GenericTypes;

import java.util.ArrayList;

public class GenericTypes {

    public static void main(String[] args) {
        
        // using ArrayList generic class
        ArrayList<String> arr = new ArrayList();
        
        arr.add(new String("lala"));
        arr.add(new String("hehe"));
        
        // just for loop
        for (int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        
        // enhanced for loop
        for (String str : arr) {
            System.out.println(str);
        }
        
        // use my own generic class
        Just<String> anotherVariable = new Just();
        anotherVariable.setValue("something");
        System.out.println(anotherVariable.gimme());
        
    }
}

// create my own generic class
class Just <WHATEVER> 
{
    public void setValue(WHATEVER value) {
        this.justVariable = value;
    }
    public WHATEVER gimme() {
        return this.justVariable;
    }
    
    WHATEVER justVariable;
}
