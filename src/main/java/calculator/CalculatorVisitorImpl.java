package calculator;

public class CalculatorVisitorImpl extends CalculatorBaseVisitor<Double> {

    @Override
    public Double visitEquation(CalculatorParser.EquationContext ctx) {
        return super.visitEquation(ctx);
    }

    @Override
    public Double visitExpression(CalculatorParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Double visitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx) {
        return super.visitMultiplyingExpression(ctx);
    }

    @Override
    public Double visitPowExpression(CalculatorParser.PowExpressionContext ctx) {
        return super.visitPowExpression(ctx);
    }

    @Override
    public Double visitSignedAtom(CalculatorParser.SignedAtomContext ctx) {
        return super.visitSignedAtom(ctx);
    }

    @Override
    public Double visitAtom(CalculatorParser.AtomContext ctx) {
        return super.visitAtom(ctx);
    }

    @Override
    public Double visitScientific(CalculatorParser.ScientificContext ctx) {
        return super.visitScientific(ctx);
    }

    @Override
    public Double visitConstant(CalculatorParser.ConstantContext ctx) {
        return super.visitConstant(ctx);
    }

    @Override
    public Double visitVariable(CalculatorParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Double visitFunc(CalculatorParser.FuncContext ctx) {
        return super.visitFunc(ctx);
    }

    @Override
    public Double visitFuncname(CalculatorParser.FuncnameContext ctx) {
        return super.visitFuncname(ctx);
    }

    @Override
    public Double visitRelop(CalculatorParser.RelopContext ctx) {
        return super.visitRelop(ctx);
    }
}
