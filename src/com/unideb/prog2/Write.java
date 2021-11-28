package com.unideb.prog2;

import java.io.*;

public class Write {
   static boolean create=false;
   static BufferedWriter bw;
    static FileWriter fw;
    public static void write(String numberList) throws IOException {
        try {
                fw = new FileWriter("Floyed.txt");
                bw = new BufferedWriter(fw);
                bw.write(numberList);
                bw.newLine();
                bw.close();
        }catch (IOException exception)
        {
            System.out.println("File do not be created!");
        }
    }
}
