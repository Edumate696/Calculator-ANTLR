package calculator;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CalculatorVisitorImpl implements CalculatorVisitor<Double>{

    @Override
    public Double visitEquation(CalculatorParser.EquationContext ctx) {

        return null;
    }

    @Override
    public Double visitExpression(CalculatorParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Double visitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx) {
        return null;
    }

    @Override
    public Double visitPowExpression(CalculatorParser.PowExpressionContext ctx) {
        return null;
    }

    @Override
    public Double visitSignedAtom(CalculatorParser.SignedAtomContext ctx) {
        return null;
    }

    @Override
    public Double visitAtom(CalculatorParser.AtomContext ctx) {
        return null;
    }

    @Override
    public Double visitScientific(CalculatorParser.ScientificContext ctx) {
        return null;
    }

    @Override
    public Double visitConstant(CalculatorParser.ConstantContext ctx) {
        return null;
    }

    @Override
    public Double visitVariable(CalculatorParser.VariableContext ctx) {
        return null;
    }

    @Override
    public Double visitFunc(CalculatorParser.FuncContext ctx) {
        return null;
    }

    @Override
    public Double visitFuncname(CalculatorParser.FuncnameContext ctx) {
        return null;
    }

    @Override
    public Double visitRelop(CalculatorParser.RelopContext ctx) {
        return null;
    }

    @Override
    public Double visit(ParseTree tree) {
        return null;
    }

    @Override
    public Double visitChildren(RuleNode node) {
        return null;
    }

    @Override
    public Double visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public Double visitErrorNode(ErrorNode node) {
        return null;
    }
}
