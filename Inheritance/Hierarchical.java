package OOPS.Inheritance;
    class Cat{
    void run()
    {
        System.out.println("Mom is walking");
    }
}
class Kitten1 extends Cat{
    void sleep()
    {
        System.out.println("kitten 1 is sleeping");
    }
}
class Kitten2 extends Cat{
    void run()
    {
        System.out.println("kitten 2 is running");
    }
}
class Kitten3 extends Cat{
    void play()
    {
        System.out.println("kitten 3 is playing");
    }
}
class Hierachical{
    public static void main(String args[]){
        Kitten3 k3=new Kitten3();
        Kitten2 k2=new Kitten2();
        Kitten1 k1=new Kitten1();
        Cat c1=new Cat();
        
        k3.play();
        c1.run();
        k2.run();
        k1.sleep();
        
        
    }
}

    

