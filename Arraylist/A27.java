package Arraylist;
import java.util.ArrayList;
public class A27 {
    



    public static void main(String[] args) {
        ArrayList<Integer> rollno = new ArrayList<>();
        rollno.add(5);
        rollno.add(6);
        rollno.add(7);
        rollno.add(8);
        rollno.add(9);
        rollno.add(10);
        System.out.println("Register Number: " + rollno);
        rollno.removeIf(f -> (f % 2) == 0);;
        System.out.println("Odd Numbers: " + rollno);
    }
}

