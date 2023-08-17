package org.example;
import org.example.util.Calculator;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        double[] numbers = new double[args.length];
        double res;

        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Double.parseDouble(args[i]);
            }

            int operator = (int) numbers[0];
            double operand1 = numbers[1];
            double operand2 = numbers[2];

            if (args.length > 3) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (numbers[2] == 0) {
                throw new ArithmeticException ();
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
            System.out.println("=" + res);

        } catch (NumberFormatException e) {
            System.out.println("Enter A NUMBER OR USE DOT!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter 3 NUMBERS!");
        }
          catch (ArithmeticException e) {
              System.out.println("Can't divide by zero!");
        }
    }
}












