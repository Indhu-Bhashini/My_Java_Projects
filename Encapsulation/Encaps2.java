package Encapsulation;

class Rectangle 
{ 
   private int length; 
   private int breadth; 
   Rectangle(int length, int breadth)
 { 
  this.length = length; 
  this.breadth = breadth; 
 } 
public int getLength()
{ 
 return length; 
} 
public int getBreadth()
{ 
 return breadth; 
} 
public void setLength(int length)
{ 
 this.length = length; 
} 
public void setBreadth(int breadth)
{ 
 this.breadth = breadth; 
 } 
}
class Main
{ 
public static void main(String[] args)
{ 
  Rectangle rect = new Rectangle(20,30); 
  int lth = rect.getLength(); 
  int bth = rect.getBreadth(); 
  int Area = lth * bth; 
  System.out.println("Area: " +Area); 
  rect.setLength(50); 
  rect.setBreadth(60); 
  int ln = rect.getLength(); 
  int br = rect.getBreadth(); 
  int newArea = ln * br; 
 System.out.println("New area: " +newArea); 
 } 
}
