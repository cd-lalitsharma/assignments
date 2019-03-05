interface Color{
    void applyColor();
}

abstract class Shape implements Color{
    protected Color color;
    Shape(Color color){
        this.color=color;
    }
     abstract public void applyColor();
}

class SquareShape extends Shape{
    
    
    SquareShape(Color color) {
        super(color);
    }
    
    @Override
    public void applyColor() {
        System.out.print("coloring squareshape with color");
        color.applyColor();
    }
}

class Red implements Color{
    
    @Override
    public void applyColor() {
        System.out.print(" Red.");
    }
}

public class Question_5 {
    
    public static void main(String[] args) {
        //Implement Bridge Design Pattern for Color
        // and Shape such that Shape and Color can be combined together e.g BlueSquare, RedSquare, PinkTriangle etc.
        SquareShape s = new SquareShape(new Red());
        s.applyColor();
    }
}
