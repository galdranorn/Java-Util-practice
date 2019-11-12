package genericmethods;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

class Editor {
    public static void print(List<? extends Figure> list) { 
        for (Figure figure : list) {
            list.add(null);
            System.out.println(figure.getName());
        }
    }
    // generic method
    public static <Type> void writeArrayToColletion (Type[] arr, Collection<Type> col) {
        for (Type obj : arr) {
            col.add(obj);
        }
    }
}
class Figure {
    public String getName(){
        return name;
    }
    String name = "";
}
class Circle extends Figure {
    public Circle() {
        super.name = "Circle";
    }
}
class Square extends Figure {
    public Square() {
        super.name = "Kwadrat";
    }
}

public class GenericMethods {
    public static void main (String[] args) {
        Figure figure1 = new Circle();
        Figure figure2 = new Square();
        
        List<Figure> figureList = new ArrayList<Figure>();
        figureList.add(figure1);
        figureList.add(figure2);
        
        Editor.print(figureList);
    }
}

