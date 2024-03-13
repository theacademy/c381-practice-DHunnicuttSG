package org.example.simpleCalculator;

public class App {
    public static void main(String[] args) {
        UserIO myIO = new UserIO();
        boolean myContinue = true;
        do {
            int choice = myIO.getMenuOptions();
            switch (choice) {
                case 1:
                    doAdd();
                    break;
                case 2:
                    doSubtract();
                    break;
                case 3:
                    doMultiply();
                    break;
                case 4:
                    doDivide();
                    break;
                case 5:
                    myContinue = false;
                    break;
                default:
                    myIO.displayMessage("Invalid Entry, try again!");
            }
        } while(myContinue);

        myIO.displayMessage("Goodbye!");
    }

    public static void doAdd(){
        UserIO myIO = new UserIO();
        SimpleCalculator myCalc = new SimpleCalculator();
        // get operands
        double oper1 = myIO.getOperand("Please enter operand 1: ");
        double oper2 = myIO.getOperand("Please enter operand 2");
        myCalc.add(oper1, oper2);
    }

    public static void doSubtract(){
        UserIO myIO = new UserIO();
        SimpleCalculator myCalc = new SimpleCalculator();
        // get operands
        double oper1 = myIO.getOperand("Please enter operand 1: ");
        double oper2 = myIO.getOperand("Please enter operand 2");
        myCalc.subtract(oper1, oper2);
    }

    public static void doMultiply(){
        UserIO myIO = new UserIO();
        SimpleCalculator myCalc = new SimpleCalculator();
        // get operands
        double oper1 = myIO.getOperand("Please enter operand 1: ");
        double oper2 = myIO.getOperand("Please enter operand 2");
        myCalc.multiply(oper1, oper2);
    }

    public static void doDivide(){
        UserIO myIO = new UserIO();
        SimpleCalculator myCalc = new SimpleCalculator();
        // get operands
        double oper1 = myIO.getOperand("Please enter operand 1: ");
        double oper2 = myIO.getOperand("Please enter operand 2");
        myCalc.divide(oper1, oper2);
    }
}
