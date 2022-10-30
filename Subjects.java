package com.company;
import java.util.Scanner;
public class Subjects {
    public static void main(String[] args) {
        int sub1, sub2, sub3, sum = 0;
        //Taking input from user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first subject marks");
        sub1 = s.nextInt();
        System.out.println("Enter the second subject marks");
        sub2 = s.nextInt();
        System.out.println("Enter the third subject marks");
        sub3 = s.nextInt();
        if (sub1 > 60 && sub2 > 60 && sub3 > 60)
            System.out.println("passed");
        if (sub1 > 60 && sub2 > 60 || sub3 > 60 || sub1 > 60 || sub2 > 60 && sub3 > 60)
            System.out.println("prompted");
        if (sub1 < 60 && sub2 < 60 && sub3 < 60)
            System.out.println("failed");
    }
}

