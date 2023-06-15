package Arraylist;
import java.util.*;
public class A4 {
    
  
   public static void main(String args[]){  
        
      ArrayList<String> animals=new ArrayList<String>();  
      animals.add("Dog");
      animals.add("Cat");
      animals.add("Panda");
      animals.add("Horse");
      animals.add(0, "Fox");
      animals.add(0, "Giraffe");
      System.out.println(animals);
   }  
}

