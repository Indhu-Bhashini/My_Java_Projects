package Arraylist;
import java.util.*;
public class A12 {
     
   public static void main(String args[]){  
        
      ArrayList<String> animals=new ArrayList<String>();  
      animals.add("Dog");
      animals.add("Cat");
      animals.add("Panda");
      animals.add("Horse");
      animals.add("Fox");
      animals.add("Giraffe");
      animals.set(4, "Cow");
      System.out.println(animals.get(4));
   }  

    
}
