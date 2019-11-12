package hashsettreeset;

import java.io.*;
import java.util.*;

public class HashSetTreeSet {
    public static void hashSetTreeSet (String[] args) {
        long mili;
        long totalMili = 0;
        
        Set<String> set = new HashSet<String>(512); // hashset jest nieuporządkowany
        //set = new TreeSet<String>(); 
        
        try {
            Scanner reader = new Scanner(new BufferedReader(new FileReader("informatyka.txt")));
            while(reader.hasNext()) {
                mili = System.currentTimeMillis();
                set.add(reader.next());
                totalMili+= (System.currentTimeMillis() - mili);
            }
            reader.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
        Iterator<String> iter = set.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
        
        System.out.println("Time: "+totalMili+" ms");
        System.out.println("Set size: "+set.size());
    }
}
