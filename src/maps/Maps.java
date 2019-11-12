package maps;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Maps {
    public static void main (String[] args) {
        // mapping = przyporządkowanie klucz-wartość
        Map<Integer, String> map = new HashMap(); // hashmap = nieuporządkowany
        TreeMap<Integer, String> map2 = new TreeMap(); // treemap = uporządkowany
        
        Worker[] workers = {
            new Worker("Agnieszka"),
            new Worker("Paweł"),
            new Worker("Beata"),
            new Worker("Gabriela"),
   
        };
        
        for (Worker worker : workers) {
            map.put(worker.getID(), worker.getName());
            map2.put(worker.getID(), worker.getName());
        }
        
        map2.put(3, "Joanna");
        map2.remove(2);
        
        System.out.println(map2);
    }
}

class Worker {
    public Worker() {
        i++;
        ID = i;
    }
    public Worker(String name) {
        this();
        this.name = name;
    }
    public int getID () { 
        return ID;
    }
    public String getName() {
        return name;
    }
    String name;
    private int ID;
    public static int i = 0;
}