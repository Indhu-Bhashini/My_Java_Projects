package OOPS;


    class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }
    
    double add(double num1, double num2) {
        return num1 + num2;
    }
    
    String add(String str1, String str2) {
        return str1 + str2;
    }
}

class Basicobj6 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum (int): " + sum1);
        
        double sum2 = calculator.add(2.5, 3.7);
        System.out.println("Sum (double): " + sum2);
        
        String result = calculator.add("Hello", "World");
        System.out.println("Concatenated String: " + result);
    }
}
    

