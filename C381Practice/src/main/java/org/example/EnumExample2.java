package org.example;

import java.util.function.DoubleBinaryOperator;

public class EnumExample2 {

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        double result = Operation.PLUS.calculate(num1, num2);
        System.out.println(num1 + " " + Operation.PLUS.getSymbol() + " " + num2 + " = " + result);

//        for(Operation op : Operation.values()) {
//            double result = op.calculate(num1, num2);
//            System.out.println(num1 + " " + op.getSymbol() + " " + num2 + " = " + result);
//        }
    }


    enum Operation {
        PLUS("+", (left, right) -> left + right),
        MINUS("-", (left, right) -> left - right),
        MULTIPLY("*", (left, right) -> left * right),
        DIVIDE("/", (left, right) -> left / right),
        MODULO("%", (left, right) -> left % right),;

        private final String symbol;
        private final DoubleBinaryOperator operation;

        Operation(String symbol, DoubleBinaryOperator operation) {
            this.symbol = symbol;
            this.operation = operation;
        }

        public double calculate(double left, double right) {
            return operation.applyAsDouble(left, right);
        }

        public String getSymbol() {
            return symbol;
        }

    }

}
