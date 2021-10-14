package com.example.generics;

public class GenericMethod {
    public <T,V> void printItems(T t, V v) {
        System.out.println(t.toString());
        System.out.println(v.toString());
    }
    public <T> T showItem(T item) {
        System.out.println("The item : " + item.toString());
        return item;
    }
    public <T> void showItems(T[] items) {
        for(T item : items)
            System.out.print(item + " ");
    }
}
class Test{
    public static void main(String[] args) {
    GenericMethod genericMethod = new GenericMethod();
    Integer [] nums = {1,2,3,4,5};
    String [] names = {"Adam", "Micheal", "Daniel", "kerry"};
    genericMethod.showItems(nums);
    genericMethod.showItems(names);
    }
}