package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class ListGeneric {
     static <T> List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }

}
class ListGenericTest {
    public static void main(String[] args) {
        List<Integer> list1 = ListGeneric.add(new ArrayList<>(), 20, 30);
        System.out.println(list1);
    }

}