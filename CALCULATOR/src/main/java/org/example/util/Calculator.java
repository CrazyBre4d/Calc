package org.example.util;

public class Calculator  {
   private Calculator(){}
    public static double sum(double operand1, double operand2) {
        return  operand1 + operand2;
    }
    public static double subtraction(double operand1, double operand2) {
        return  operand1 - operand2;
    }
    public static double multiplication(double operand1, double operand2) { return  operand1 * operand2; }
    public static double division(double operand1, double operand2) {
        return  operand1 / operand2;
    }
}
