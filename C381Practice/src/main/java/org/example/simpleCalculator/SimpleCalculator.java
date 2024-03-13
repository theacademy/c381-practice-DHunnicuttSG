package org.example.simpleCalculator;

public class SimpleCalculator {

    public void add(double oper1, double oper2) {
        double result = oper1 + oper2;
        System.out.println(oper1 + " + " + oper2 + " = " + result);
    }

    public void subtract(double oper1, double oper2) {
        double result = oper1 - oper2;
        System.out.println(oper1 + " - " + oper2 + " = " + result);
    }

    public void multiply(double oper1, double oper2) {
        double result = oper1 * oper2;
        System.out.println(oper1 + " * " + oper2 + " = " + result);
    }

    public void divide(double oper1, double oper2) {
        if (oper2 == 0) {
            System.out.println("Undefined");
        } else {
            double result = oper1 / oper2;
            System.out.println(oper1 + " / " + oper2 + " = " + String.format("%.3f", result));
        }
    }
}
