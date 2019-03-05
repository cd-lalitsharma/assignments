interface car{
    void run();
}

interface AbstractCarFactory{
    car getCar(String type);
}

class Honda implements car{
    
    @Override
    public void run() {
        System.out.println("Indian car honda running");
    }
}

class Waganor implements car{
    @Override
    public void run() {
        System.out.println("Indian car waganor running");
    }
}

class Farrari implements car {
    @Override
    public void run() {
        System.out.println("American car Farrari running");
    }
}

class Audi implements car{
    @Override
    public void run() {
        System.out.println("American car Audi running");
    
    }
}

class IndianCarFactory implements AbstractCarFactory{
    
    
    @Override
    public car getCar(String type) {
        if (type.equalsIgnoreCase("waganor")){
            return new Waganor();
        }else if (type.equalsIgnoreCase("honda")){
            return new Honda();
        }else{
            return null;
        }
    }
}

class AmericanCarFactory implements AbstractCarFactory{
    
    @Override
    public car getCar(String type) {
        if (type.equalsIgnoreCase("farrari")){
            return new Farrari();
        }else if (type.equalsIgnoreCase("audi")){
            return new Audi();
        }else{
            return null;
        }
    }
}

class FactoryProducer{
    static AbstractCarFactory getFactory(String factoryType){
        if (factoryType.equalsIgnoreCase("indian")){
            return new IndianCarFactory();
        }else if (factoryType.equalsIgnoreCase("american")){
            return new AmericanCarFactory();
        }else {
            return null;
        }
    }
}

public class Question_3 {
    public static void main(String[] args) {
        //Implement Abstract Factory Pattern to create cars of different categories from different countries.
        
        AbstractCarFactory abstractCarFactory=FactoryProducer.getFactory("indian");
        car car1 = abstractCarFactory.getCar("honda");
    
        car1.run();
        
        abstractCarFactory=FactoryProducer.getFactory("american");
        car car2 = abstractCarFactory.getCar("audi");
        car2.run();
        
    }
}
