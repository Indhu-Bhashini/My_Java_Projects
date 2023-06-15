package Arraylist;
import java.util.*;
public class A23 {
    
 
   public static void main(String args[]){  
        
      ArrayList<String> animals=new ArrayList<String>();  
      animals.add("Dog");
      animals.add("Horse");
      animals.add("Cat");
      animals.add("Panda");
      animals.add("Fox");
      animals.add("Giraffe");
      Collections.shuffle(animals);
      System.out.println(animals);
   }  
}

