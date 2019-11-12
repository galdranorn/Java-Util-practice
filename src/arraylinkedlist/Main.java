package arraylinkedlist;

import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList arr = new ArrayList(); // lista tablicowa
        // w liście tablicowej elementy są jeden po drugim
        // + szybki dostęp do zawartości
        // - wolna przy dodawaniu nowych elementów
        
        LinkedList linked = new LinkedList(); // lista polaczona
        // między elementami może być inny obiekt, element wskazuje na inny element
        // + szybkie dodawanie i usuwanie elementów
        // - wolniejszy dostęp do zawartości
        
        Linked linked2 = new Linked();
        linked2.value = 10;
        linked2.next = new Linked();
        linked2.next.value = 20;
        linked2.next.next = new Linked();
        linked2.next.next.value = 30;
    }
    
    // zasada działania listy polaczonej
    static class Linked {
        int value;
        Linked previous;
        Linked next; // klasa rekurencyjna = stworzona sama w sobie
    }
}
 