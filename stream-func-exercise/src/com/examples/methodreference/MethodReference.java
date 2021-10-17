package com.examples.methodreference;

import java.util.function.Function;

public class MethodReference {
    static Function<String, String> toUpperCaseLambda = String::toUpperCase;


    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("java8"));
    }
}
