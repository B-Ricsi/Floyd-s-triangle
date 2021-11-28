package com.unideb.prog2;

import java.util.Scanner;

public class Input {
    public static int input()
    {
        int n=0;
        System.out.print("Kérem az 'n'-t (n>0): ");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        return n;
    }

}
