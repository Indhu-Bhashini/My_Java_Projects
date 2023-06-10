package Abstraction;
abstract class Animals{
    abstract void sound();
}
class Cat extends Animals{
    public void sound()
    {
        System.out.println("Meow Meow");
    }

}
class Dog extends Animals{
    public void sound()
    {
        System.out.println("Bow Bow");
    }
}
class Cow extends Animals{
    public void sound()
    {
        System.out.println("Moo Moo");
    }
}
public class Abs {
    public static void main(String args[]){
        Cow c=new Cow();
        c.sound();
        Dog d=new Dog();
        d.sound();
        Cat k=new Cat();
        k.sound();





    }
    
}
