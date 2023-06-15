package Arraylist;
import java.util.ArrayList;

public class A26 {
    

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();

    
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    System.out.println("ArrayList: " + numbers);

    System.out.print("Updated ArrayList: ");

    
    numbers.forEach((e) -> {
      e = e * e;
      System.out.print(e + " ");
    });

  }
}

