package Arraylist;
import java.util.*;


public class A17 {
  
   public static void main(String args[]){  
        
      ArrayList<String> animals=new ArrayList<String>();  
      animals.add("Dog");
      animals.add("Horse");
      animals.add("Cat");
      animals.add("Panda");
      animals.add("Horse");
      animals.add("Fox");
      animals.add("Giraffe");
      animals.add("Horse");
      System.out.println(animals.lastIndexOf("Horse"));
   }  
}

