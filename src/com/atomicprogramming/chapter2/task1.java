package com.atomicprogramming.chapter2;

public class task1 {

    public static int find_perimeter(int length, int width) {
        return (length * 2) + (width * 2);
    }

    public static int find_area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int length = 18;
        int width = 7;
        System.out.println("The perimeter of the rectangle is " + find_perimeter(length, width));
        System.out.println("The area of the rectangle is " + find_area(length, width));
    }
}
