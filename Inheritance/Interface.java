package Inheritance;
interface Vehicle {
  public void fuelconsumption(); 
  public void speed(); 
}


class Maruthi implements Vehicle {
  public void fuelconsumption() {
    
    System.out.println("Consumes more fuel");
  }
  public void speed() {
    
    System.out.println("High speed");
  }
}

class Interface {
  public static void main(String[] args) {
    Maruthi m = new Maruthi();  
    m.fuelconsumption();
    m.speed();
  }
}
