package Arraylist;
import java.util.*;
public class A3 {
    
 
   public static void main(String args[]){  
        
      ArrayList<String> animals=new ArrayList<String>();  
      animals.add("Dog");
      animals.add("Cat");
      animals.add("Panda");
      animals.add("Horse");
      animals.add(2,"Cow");
      ArrayList<String> other_animals = new ArrayList<String>(Arrays.asList("Giraffe", "Fox"));
      animals.addAll(5,other_animals);
      System.out.println(animals);
   }  
}

