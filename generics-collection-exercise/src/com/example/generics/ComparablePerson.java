package com.example.generics;

public class ComparablePerson implements Comparable<ComparablePerson>{
private int age;
private String name;

    public ComparablePerson(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(ComparablePerson otherPerson) {
        return Integer.compare(age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "ComparablePerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class ComparablePersonTest {
    public static <T extends Comparable<T>> T calculateMinAge(T person1, T person2) {
        if(person1.compareTo(person2) < 0)
            return person1;
        return person2;
    }
    public static <T extends Number> double add(T num1, T num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculateMinAge(
                new ComparablePerson("Adam", 48),
                new ComparablePerson("Elia", 61)
        ));
        System.out.println(add(10,20));
        System.out.println(add(11,5.7));
        System.out.println(add(5, 4.1f));
    }
}
