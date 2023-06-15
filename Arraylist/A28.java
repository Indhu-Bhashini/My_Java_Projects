package Arraylist;
import java.util.ArrayList;
public class A28 {

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        numbers.add(9);
        numbers.add(10);
        numbers.add(13);
        numbers.add(14);
        numbers.add(16);
        System.out.println("ArrayList: " + numbers);

        
        numbers.subList(1, 3).clear();
        System.out.println("Updated ArrayList: " + numbers);
    }
}

