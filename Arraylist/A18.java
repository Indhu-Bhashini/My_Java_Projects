package Arraylist;
import java.util.*;
public class A18 {
    

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
      ArrayList<String> sub_ArrayList = new ArrayList<String>(animals.subList(4, 7));
      System.out.println(sub_ArrayList);
   }  
}

