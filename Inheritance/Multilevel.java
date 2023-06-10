package OOPS.Inheritance;
class Grandparent{
    void edu(){
        System.out.println("Teach kids about family");
    }
}
class Parent extends Grandparent{
    void work(){
        System.out.println("Parent working");
    }
}
class Child extends Parent{
    void play(){
        System.out.println("Children playing");
    }
}
public class Multilevel {
    public static void main(String args[]){
    Child C=new Child();
    
    C.play();
    C.work();
    C.edu();
    

    }

}
