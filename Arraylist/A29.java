package Arraylist;
import java.util.*;
public class A29 {
    

    public static void main(String args[]) {
        String para="Bob hit a ball, the hit BALL flew far after it was hit.";
        String ban[]={"hit"};
        String s="";
        String pl=para.toLowerCase();
        String[] ps=pl.split("\\W+");
        int c=0,max=0;
        ArrayList<String>l=new ArrayList<>();
        ArrayList<String>bn=new ArrayList<>();
        for(int i=0;i<ban.length;i++){
            bn.add(ban[i]);
        }
        ArrayList<String>l1=new ArrayList<>(Arrays.asList(ps));
        for(int i=0;i<l1.size();i++){
            if(!l.contains(l1.get(i))){
                l.add(l1.get(i));
            }
        }
        for(int i=0;i<l.size();i++){
                c=0;
                if(!bn.contains(l.get(i))){
                    c=Collections.frequency(l1,l.get(i));
                }
            if(c>max){
                max=c;
                s=l.get(i);
            }
        }
        System.out.println(s);
    }
}

