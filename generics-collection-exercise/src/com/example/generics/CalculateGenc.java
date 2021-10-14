package com.example.generics;

public class CalculateGenc {
    public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
        if(num1.compareTo(num2) < 0)
            return num1;

        return num2;
    }
}

class CalculateGencTest{
    public static void main(String[] args) {
        System.out.println(CalculateGenc.calculateMin(7, 10));
        System.out.println(CalculateGenc.calculateMin(10.1, 14.7));
        System.out.println(CalculateGenc.calculateMin("arow", "helped"));
    }
}
