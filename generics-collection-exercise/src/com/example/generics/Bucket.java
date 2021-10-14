package com.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Bucket <T>{
    private T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
class BucketTest{
    public static <T> void addStore(T t, List<Bucket<T>> list) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + "has been added to the list");
    }
    public static void main(String[] args) {
        List<Bucket<String>> list = new ArrayList<>();
       //BucketTest.<String>addStore("Daniel", list); TYPE INFERENCE
        addStore("Adam", list);
        addStore("Sergio", list);
        addStore("George", list);
        list.forEach(item -> System.out.println(item.getItem()));

        List<Bucket<Integer>> list2 = new ArrayList<>();
        //BucketTest.<Integer>addStore(10,list2);  TYPE INFERENCE
        addStore(15,list2);
        addStore(20,list2);
        addStore(30, list2);
        list2.forEach(item -> System.out.println(item.getItem()));
    }
}