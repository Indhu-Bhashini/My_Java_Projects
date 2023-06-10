package Polymorphism;

class Mtech{
    void intern(){
        System.out.println("Training for job");
    }
}
class Rahul extends Mtech{
    void intern(){
        System.out.println("Good at java");
    }
}
class Riyaz extends Mtech{
    void intern(){
        System.out.println("Good at sql");
    }
}
class Rohit extends Mtech{
    void intern(){
        System.out.println("Good at c");
    }
}
class Poly{
    public static void main(String args[]){
        Mtech m=new Mtech();
        Mtech Rahul=new Rahul();
        Mtech Riyaz=new Riyaz();
        Mtech Rohit=new Rohit();
        m.intern();
        Rahul.intern();
        Riyaz.intern();
        Rohit.intern();
    }
}