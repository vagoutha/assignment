package com.company;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        int s1, s2, s3, m1, h1, c1, m2, h2, c2, m3, h3, c3, t1, t2, t3, a1, a2, a3, st1, st2, st3, sa1, sa2, sa3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first student maths marks subject marks");
        m1 = s.nextInt();
        System.out.println("Enter first student history marks subject marks");
        h1 = s.nextInt();
        System.out.println("Enter first student chemistry marks subject marks");
        c1 = s.nextInt();
        System.out.println("Enter second student maths marks subject marks");
        m2 = s.nextInt();
        System.out.println("Enter second student history marks subject marks");
        h2 = s.nextInt();
        System.out.println("Enter second student chemistry marks subject marks");
        c2 = s.nextInt();
        System.out.println("Enter third student maths marks subject marks");
        m3 = s.nextInt();
        System.out.println("Enter third student history marks subject marks");
        h3 = s.nextInt();
        System.out.println("Enter third student chemistry marks subject marks");
        c3 = s.nextInt();
        t1 = m1 + h1 + c1;
        System.out.println("first student total marks" + t1);
        t2 = m2 + h2 + c2;
        System.out.println("second student total marks" + t2);
        t3 = m3 + h3 + c3;
        System.out.println("third student total marks" + t3);
        a1 = (m1 + h1 + c1) / 3;
        System.out.println("first student average marks" + a1);
        a2 = (m2 + h2 + c2) / 3;
        System.out.println("second student average marks" + a2);
        a3 = (m3 + h3 + c3) / 3;
        System.out.println("third student average marks" + a3);
        st1 = m1 + m2 + m3;
        System.out.println("maths total marks" + st1);
        st2 = h1 + h2 + h3;
        System.out.println("history total marks" + st2);
        st3 = c1 + c2 + c3;
        System.out.println("chemistry total marks" + st3);
        sa1 = (m1 + m2 + m3) / 3;
        System.out.println("maths average marks" + sa1);
        sa2 = (h1 + h2 + h3) / 3;
        System.out.println("history average marks" + sa2);
        sa3 = (c1 + c2 + c3) / 3;
        System.out.println("chemistry average marks" + sa3);
    }
}



