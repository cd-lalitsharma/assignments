interface Polygon{
    void rectangle();
    void square();
    
}

class Recatangle implements Polygon{
    @Override
    public void rectangle() {
        System.out.println("Inside recatangle class");
    }
    
    @Override
    public void square() {
    
    }
}
class Square implements Polygon{
    @Override
    public void square() {
        System.out.println("inside square class");
    }
    
    @Override
    public void rectangle() {
    
    }
}

class FactoryPolygon{
    
    public Polygon getPolygon(String type){
        if (type.equalsIgnoreCase("rectangle")){
            return new Recatangle();
        }else if (type.equalsIgnoreCase("square")){
            return new Square();
        }else{
            return null;
        }
    }
}
public class Question_2 {
    public static void main(String[] args) {
        //Implement Factory Pattern to get the Polygon of differnt type.
        
        FactoryPolygon factoryPolygon = new FactoryPolygon();
        Polygon polygon=factoryPolygon.getPolygon("square");
        polygon.square();
    }
}
