package Arraylist;
import java.util.*;
public class A24 {
    

    public static void main(String args[]) {
        int c=0;
        String[] animals={"horse","giraffe","cat","dog","cat","horse"};
        ArrayList<String>An = new ArrayList<>();
        for(int i=0;i<animals.length;i++){
            if(An.contains(animals[i])==false){
                An.add(animals[i]);
                c++;
            }
        }
        for(int i=0;i<c;i++){
            System.out.println(An.get(i));
        }
    }
}

