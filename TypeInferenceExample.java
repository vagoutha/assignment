package com.company;


public class TypeInferenceExample {
    public static void main(String[] args)  {
        StringLengthLambda mylambda =  s -> s.length();
        System.out.println (mylambda.getLength("Hello lambda"));

    }



    interface StringLengthLambda {
        int getLength(String s);
    }
}

