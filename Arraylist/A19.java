package Arraylist;
import java.util.*;
public class A19 {
    
 
   public static void main(String args[]){  
        
      ArrayList<String> animals=new ArrayList<String>();  
      animals.add("Dog");
      animals.add("Horse");
      animals.add("Cat");
      ArrayList<String> other_animals=new ArrayList<String>();  
        other_animals.add("Panda");  
        other_animals.add("Fox");
        other_animals.add("Giraffe");
        animals.retainAll(other_animals);  
        System.out.println(other_animals);
      
   }  
}

