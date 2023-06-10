package OOPS.Inheritance;
class Parent
{
    void work()
    {
        System.out.println("Parent working");
    }
}
class Child extends Parent
{
    void play()
    {
        System.out.println("Child playing");
    }
}
class Single{
    public static void main(String args[]){
        Child c=new Child();
        c.play();
        c.work();
    }
}