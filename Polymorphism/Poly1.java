package Polymorphism;
class Vehicle {
    void run() {
        System.out.println("Vehicle is moving");
    }
}

class Maruthi extends Vehicle {
    void run() {
        System.out.println("car is running safely");
    }
}
    class Suzuki extends Vehicle {
    void run() {
        System.out.println("car is running safely");
    }
}

    class Poly1{
        public static void main(String args[]) {
            Suzuki obj = new Suzuki();
            obj.run();
            Maruthi obj1=new Maruthi();
            obj1.run();
        }
    }
