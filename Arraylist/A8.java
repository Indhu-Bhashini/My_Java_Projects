package Arraylist;
import java.util.*;
public class A8 {
    

   public static void main(String args[]){  
        
      ArrayList<String> animals=new ArrayList<String>();  
      animals.add("Dog");
      animals.add("Cat");
      animals.add("Panda");
      animals.add("Horse");
      animals.add("Fox");
      animals.add("Giraffe");
      animals.trimToSize();
      System.out.println(animals.size());
      System.out.println(animals);
   }  
}

