package OOPS;

class Circle
{
 double area(double r)
 {
  return 3.14*r*r;
 }
}

class Rectangle
{
 int area(int x, int y)
 {
  return x * y;
 }
}


class Basicobj4
{
 public static void main(String args[])
 {
  Circle c = new Circle();
  Rectangle r = new Rectangle();
  System.out.println("Circle "+ c.area(5));
  System.out.println("Rectangle: "+ r.area(2,6));
}
}