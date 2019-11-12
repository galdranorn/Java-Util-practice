package hashcode;

class Element
{
    public Element(int value) {
        this.value = value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.value == ((Element)obj).value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 14 * hash + this.value;
        
        // nadmierne:
        // hash = 89 * hash + (int) (Double.doubleToLongBits(this.cos) ^ (Double.doubleToLongBits(this.cos) >>> 32));
        // hash = 89 * hash + (int) (this.cos2 ^ (this.cos2 >>> 32));
        // hash = 89 * hash + (this.co3 != null ? this.co3.hashCode() : 0);
        
        return hash;
    }
    
    int value;
}

public class HashCode
{
    public static void main(String[] args) 
    {
        Element a = new Element(47);
        Element b = new Element(15);
        Element c = null;
        System.out.println(a.equals(b));
        
        System.out.println(a.hashCode()%128); // kod mieszający, powiększanie tablicy
        System.out.println(b.hashCode()%128);
    }
}