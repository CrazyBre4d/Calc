package org.example;

import org.example.util.Calculator;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length > 3) {
            throw new ArrayIndexOutOfBoundsException("Enter 3 numbers!");
            }

            double[] numbers = new double[args.length];
            double res=0;

            for (int i = 0; i < args.length; i++) {
                numbers[i] = Double.parseDouble(args[i]);
            }

            double operand1 = numbers[1];
            double operand2 = numbers[2];
            int operator = (int) numbers[0];

            if (operand2 == 0) {
                throw new ArithmeticException("Can't divide by zero!");
            }

            switch (operator) {
                case 1:
                    res = Calculator.sum(operand1, operand2);
                    break;
                case 2:
                    res = Calculator.subtraction(operand1, operand2);
                    break;
                case 3:
                    res = Calculator.multiplication(operand1, operand2);
                    break;
                case 4:
                    res = Calculator.division(operand1,operand2);
                    break;
                default:
                    throw new IllegalArgumentException("Enter number from 1 to 4!");
            }
            String total = String.format("= %f", res);
            System.out.println(total);
        }   catch (NumberFormatException e) {
            System.out.println("Enter A NUMBER OR USE DOT!");
        }   catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}












