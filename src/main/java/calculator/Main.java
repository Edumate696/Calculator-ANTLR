package calculator;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.Scanner;

public class Main {

    /**
     * Main Function
     */
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.print(">> ");
            String source = sc.nextLine();
            if (source.equals("exit")) System.exit(0);
            System.out.println(Main.calculate(source));
        }
//        System.out.println(calculator.calculate("2 + 5"));  // 7.0
//        System.out.println(calculator.calculate("2 * 5"));  // 10.0
//        System.out.println(calculator.calculate("5 - 3"));  // 2.0
//        System.out.println(calculator.calculate("5 / 3"));  // 1.6666666666666667
//        System.out.println(calculator.calculate("5 # 3"));  // Error: line 1:2 token recognition error at: '#'
        } catch (Throwable t){
            System.err.println(t);
        }
    }

    public static Double calculate(String source) {
        CodePointCharStream input = CharStreams.fromString(source);
        CalculatorLexer lexer = new CalculatorLexer(input);

        CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));
        ParseTree ast = parser.parse();

        return null;
    }
}
