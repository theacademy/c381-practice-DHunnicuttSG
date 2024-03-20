package org.example;

public class EnumExample1 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        for(MathOperator op : MathOperator.values()) {
            int result = calculate(op, num1, num2);
            System.out.println(num1 + " " + op + " " +  num2 + " = " + result);
        }
    }

    public enum MathOperator {
        PLUS, MINUS, MULTIPLY, DIVIDE, MODULO
    }

    public static int calculate(MathOperator operator, int operand1, int operand2) {

        switch(operator) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            case MODULO:
                return operand1 % operand2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
