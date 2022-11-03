package com.company;
@FunctionalInterface
interface Arithmetic
{

    int operations(int a,int b);
}
public class LambdaQue1
{
    public static void main(String args[])
    {
        Arithmetic addition = (a, b) -> (a + b);
        System.out.println("Addition -> " + addition.operations(4,6));

        Arithmetic subtraction = (a, b) -> (a - b);
        System.out.println("Subtraction -> " + subtraction.operations(9,7));

        Arithmetic multiplication = (a, b) -> (a * b);
        System.out.println("Multiplication -> " + multiplication.operations(6,4));

        Arithmetic division = (a, b) -> (a / b);
        System.out.println("Division -> " + division.operations(4,2));


    }
}

