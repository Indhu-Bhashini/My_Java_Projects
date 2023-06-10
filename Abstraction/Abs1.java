package Abstraction;

abstract class Cloth {
    abstract void makeStitch();
}

class Shirt extends Cloth {
    void makeStitch() {
        System.out.println("Formals");
    }
}

class Pant  extends Cloth {
    void makeStitch() {
        System.out.println("Casuals");
    }
}

public class Abs1 {
    public static void main(String[] args) {
        Cloth shirt = new Shirt();
        shirt.makeStitch();  
        
        Cloth pant = new Pant();
        pant.makeStitch(); 
    }
}
