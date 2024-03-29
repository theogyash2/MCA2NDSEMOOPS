class Calculator {
    int num1;
    int num2;
    
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }
    
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public int add() {
        return num1 + num2;
    }
    
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public int multiply() {
        return num1 * num2;
    }
}

public class TestApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.num1 = 5;
        calc.num2 = 3;
        
        int sum1 = calc.add(10, 20);
        System.out.println("Sum (with parameters): " + sum1);
        
        int sum2 = calc.add();
        System.out.println("Sum (without parameters): " + sum2);
        
        int product1 = calc.multiply(4, 5);
        System.out.println("Product (with parameters): " + product1);
        
        int product2 = calc.multiply();
        System.out.println("Product (without parameters): " + product2);
    }
}
