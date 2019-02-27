interface Furniture {
    void stresstest();
    
    void firetest();
}

abstract class Chairs {
    
    public Chairs() {
        System.out.println("This is Chairs Abstract Class");
    }
}

abstract class Tables {
    
    public Tables() {
        System.out.println("This is Tables Abstract Class");
    }
}

class WoodenChairs extends Chairs implements Furniture {
    
    @Override
    public void stresstest() {
        System.out.println("WoodenChairs Stress Test");
    }
    
    @Override
    public void firetest() {
        System.out.println("WoodenChairs Fire Test");
    }
}

class WoodenTables extends Tables implements Furniture {
    
    @Override
    public void stresstest() {
        System.out.println("WoodenTables Stress Test");
    }
    
    @Override
    public void firetest() {
        System.out.println("WoodenTables Fire Test");
    }
}

class MetallicChairs extends Chairs implements Furniture {
    
    @Override
    public void stresstest() {
        System.out.println("MetallicChairs Stress Test");
    }
    
    @Override
    public void firetest() {
        System.out.println("MetallicChairs Fire Test");
    }
}

class MetallicTables extends Tables implements Furniture {
    
    @Override
    public void stresstest() {
        System.out.println("MetallicTables Stress Test");
    }
    
    @Override
    public void firetest() {
        System.out.println("MetallicTables Fire Test");
    }
}
public class Question_9 {
    public static void main(String[] args) {
        System.out.println("Q. Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables. There are stress and fire tests for each products.");
    
        WoodenChairs woodenChairs = new WoodenChairs();
        woodenChairs.stresstest();
        woodenChairs.firetest();
        System.out.println();
        WoodenTables woodenTables = new WoodenTables();
        woodenTables.stresstest();
        woodenTables.firetest();
        System.out.println();
        MetallicChairs metallicChairs = new MetallicChairs();
        metallicChairs.stresstest();
        metallicChairs.firetest();
        System.out.println();
        MetallicTables metallicTables = new MetallicTables();
        metallicTables.stresstest();
        metallicTables.firetest();
    }
}
