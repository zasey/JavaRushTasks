package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader inputBuff = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter outputBuff = new BufferedWriter(new FileWriter(inputBuff.readLine()))){

                while(true) {
                    String s = inputBuff.readLine();
                    if(s.equalsIgnoreCase("exit")) {
                        outputBuff.write(s);
                        break;
                    }
                    outputBuff.write(s + "\n");
                }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
