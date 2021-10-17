package com.examples.methodreference;

import com.examples.data.Student;
import com.examples.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {
    static Consumer<Student> c2 = System.out::println;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
