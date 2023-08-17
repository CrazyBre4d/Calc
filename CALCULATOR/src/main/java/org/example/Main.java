package org.example;
import org.example.util.Calculator;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        try {
            double[] numbers = new double[args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Double.parseDouble(args[i]);
            }

            if (args.length > 3) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (numbers[2] == 0) {
                throw new ArithmeticException ("No null");
            }

            switch ((int) numbers[0]) {
                case 1:
                    System.out.println("=" + Calculator.sum(numbers[1], numbers[2]));
                    break;
                case 2:
                    System.out.println("=" + Calculator.subtraction(numbers[1], numbers[2]));
                    break;
                case 3:
                    System.out.println("=" + Calculator.multiplication(numbers[1], numbers[2]));
                    break;
                case 4:
                    System.out.println("=" + Calculator.division(numbers[1], numbers[2]));
                    break;
                default:
                    throw new IllegalArgumentException("Enter number from 1 to 4!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Enter A NUMBER!!!!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter 3 NUMBERS!!!!");
        }
          catch (ArithmeticException e) {
              System.out.println("NO NULL!!!");
        }
    }
}
//использовать переменные, а не кентов массива!











