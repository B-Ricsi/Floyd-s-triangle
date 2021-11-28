package com.unideb.prog2;

import java.util.List;

public class Calculator {

    public void calculate(List<Integer> array)
    {
        int sum=0;
        for(int i = 0; i < array.size(); i++)
            sum += array.get(i);
        System.out.println("The sum of the numbers at the end of the lines: "+sum);
    }
}
