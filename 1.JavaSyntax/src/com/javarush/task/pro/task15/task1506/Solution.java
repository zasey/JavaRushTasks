package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner console = new Scanner(System.in)){
            String name = console.nextLine();
            var result = Files.readAllLines(Paths.get(name));
            result.forEach(s -> {
                s.chars().filter(c -> c != ' ' && c != '.' && c != ',').forEach(character -> {
                        System.out.print((char)character);
                });
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

