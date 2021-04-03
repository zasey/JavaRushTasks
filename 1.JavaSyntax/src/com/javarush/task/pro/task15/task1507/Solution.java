package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner console = new Scanner(System.in)){
            String name = console.nextLine();
            var input = Files.readAllLines(Paths.get(name));
            String isOk = "";
            BinaryOperator<String> accumulator = (internalOk, string) -> {
                if(internalOk.isEmpty()) {
                    System.out.println(string);
                    return "abc";
                }
                else return "";
            };
            input.stream().reduce(isOk,accumulator);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

