package linkedlistiterators;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListIterators {
    
    public static void linkedListIterators (String[] args) {
        LinkedList<String> linked = new LinkedList();
        linked.add("1st element");
        linked.add("2nd element");
        linked.add("3rd element");
        linked.add("4th element");
        
        // TAK NIE ROBIĆ - bardzo wolne szukanie w LinkedList
        // pętla for zawsze przechodzi od zera i "pyta" o kolejny element
        // jeżeli szukamy linked.get[500] to dopiero 499 element odeśle do 500
        
        // for (int i=0; i<linked.size(); i++) {
        //    System.out.println(linked.get(i));
        //}
        
        LinkedListIterators.writeReversed(linked);
        LinkedListIterators.removeElements(linked);
        LinkedListIterators.printElements(linked);
    }
    
    public static void printElements (LinkedList<?> list) {
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("End of list");
    }
    
    public static void removeElements (LinkedList<?> list) {
        Iterator it = list.iterator();
        it.next();
        it.remove(); // remove zawsze usuwa poprzednika -> tutaj pierwszy element
        // it.add("lala") // add zawsze dodaje przed iteratorem
    }
    
    public static void changeElements (LinkedList<?> list) {
        ListIterator it = list.listIterator();
        while (it.hasPrevious()) {
            it.set("podmiana");
        }
        
    }
    public static void writeReversed (LinkedList<?> list) {
        int size = list.size();
        ListIterator it = list.listIterator(size);
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        
    }
}
