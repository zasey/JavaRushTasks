package com.javarush.task.pro.task12.task1212;
import java.util.Arrays;
/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        String[] newarr = Arrays.copyOf(this.elements, (int)(capacity *= 1.5));
        this.elements = newarr;
    }

}
