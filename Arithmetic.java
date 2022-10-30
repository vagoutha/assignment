package com.company;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        try {
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Divison by zero");
            e.printStackTrace();
        }
        }
}
