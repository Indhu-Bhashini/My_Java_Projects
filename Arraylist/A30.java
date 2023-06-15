package Arraylist;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
class A30 {
    public static void main (String args[]){//List<Integer> main(String args[]) {
        int[] num={1,2,0,0};
        int k=34;
        String e="";
        String m="";
        for(int i=0;i<num.length;i++){
            e=Integer.toString(num[i]);
            m+=e;
        }
        String ch=Integer.toString(k);
        BigInteger a=new BigInteger(m);
        BigInteger b=new BigInteger(ch);
        BigInteger c=a.add(b);
        String rs=c.toString();
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<rs.length();i++){
            res.add(Character.getNumericValue(rs.charAt(i)));
        }
        return res;
    }
}