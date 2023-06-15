package Arraylist;
import java.util.*;
public class A21 {
    
 
   public static void main(String args[]){  
        
      ArrayList<String> animals=new ArrayList<String>();  
      animals.add("Dog");
      animals.add("Horse");
      animals.add("Cat");
      animals.add("Panda");
      animals.add("Fox");
      animals.add("Giraffe");
      Collections.sort(animals, Collections.reverseOrder());
      System.out.println(animals);
   }  
}

