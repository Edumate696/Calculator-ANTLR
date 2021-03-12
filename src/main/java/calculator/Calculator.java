package calculator;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

public class Calculator {

    /**
     * Main Function
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate("2 + 5"));  // 7.0
        System.out.println(calculator.calculate("2 * 5"));  // 10.0
        System.out.println(calculator.calculate("5 - 3"));  // 2.0
        System.out.println(calculator.calculate("5 / 3"));  // 1.6666666666666667
        System.out.println(calculator.calculate("5 # 3"));  // Error: line 1:2 token recognition error at: '#'
    }

    private Double calculate(String source) {
        CodePointCharStream input = CharStreams.fromString(source);
        CalculatorLexer lexer = new CalculatorLexer(input);
        return null;
    }
}
