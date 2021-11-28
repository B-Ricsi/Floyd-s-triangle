package com.unideb.prog2;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Input input=new Input();
        Write write=new Write();
        Calculator cal=new Calculator();
        String empty="\n";
        List<String> numberList = new ArrayList<String>();
        List<Integer> array = new ArrayList<Integer>();
        int n=0;
        int sum=0;
        do {
            n=Input.input();
        }while(n<0);
        int i, j, m = 1;
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(m + " ");
                    numberList.add(String.valueOf(m));
                m++;
                }
                array.add(m-1);
                try {
                    write.write(numberList.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
               numberList.add(empty.toString());
                System.out.println();
            }
        cal.calculate(array);
    }
}

