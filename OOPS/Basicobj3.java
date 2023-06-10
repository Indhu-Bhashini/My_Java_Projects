package OOPS;

class Basicobj3 {

  public int multiply(int x, int y) {
    int multiply = x* y;
    return multiply;
  }

  public static void main(String[] args) {
    
    int Number1 = 4;
    int Number2 = 2;

    Basicobj3 obj = new Basicobj3();
    int res = obj.multiply(Number1,Number2);
    System.out.println("By multiplying " + Number1 + " and " + Number2 + ".The output will be  " +res);
}

}
