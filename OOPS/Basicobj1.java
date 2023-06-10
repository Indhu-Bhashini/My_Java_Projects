package OOPS;
    class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("The car is driving.");
    }

    public String getBrand() {
        return brand;
    }
}
    class Basicobj1{
    public static void main(String[] args) {
        Car car1 = new Car("Honda");
        System.out.println(car1.getBrand());  
        car1.drive();                         
    }
}
    

