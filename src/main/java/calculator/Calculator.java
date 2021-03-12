package calculator;

public class Calculator {

    
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate("2 + 5"));  // 7.0
        System.out.println(calculator.calculate("2 * 5"));  // 10.0
        System.out.println(calculator.calculate("5 - 3"));  // 2.0
        System.out.println(calculator.calculate("5 / 3"));  // 1.6666666666666667
        System.out.println(calculator.calculate("5 # 3"));  // Error: line 1:2 token recognition error at: '#'
    }

    private Double calculate(String source) {
        return null;
    }
}
