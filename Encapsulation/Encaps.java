package Encapsulation;
class Employee {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}

public class Encaps {

   public static void main(String args[]) {
      Employee encap = new Employee();
      encap.setName("Rahul");
      encap.setAge(23);
      encap.setIdNum("ABC123");

      System.out.println("Name : " + encap.getName() );
      System.out.println("Age : " + encap.getAge());
      System.out.println("IdNum : " + encap.getIdNum());
   }
}

