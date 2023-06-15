package Arraylist;
import java.util.ArrayList;
import java.util.Iterator;

    

class A25 {
  public static void main(String[] args){
    ArrayList<String> animals = new ArrayList<>();

    
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    animals.add("Sheep");

    Iterator<String> iterate = animals.iterator();
    System.out.print("ArrayList: ");

    
    while(iterate.hasNext()){
      System.out.print(iterate.next());
      System.out.print(", ");
    }
  }
}

