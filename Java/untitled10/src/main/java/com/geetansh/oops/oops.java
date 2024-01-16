package com.geetansh.oops;

import java.util.Arrays;

public class oops {
    public static void main(String[] args) {
        Student[] students = new Student[5];
       // Student geetansh;
        System.out.println(Arrays.toString(students));


//        Student geetansh;
//        geetansh = new Student();
        Student kunal = new Student("kunal kushwaha", 56, 92.33f);


//        kunal.roll = 56;
//        kunal.name = "kunal kushwaha";
        System.out.println(kunal);
        System.out.println(kunal.roll);
        System.out.println(kunal.name);
        kunal.greeting();


        Student student1 = new Student();
        Student student2 = student1;

        student1.name = "geetansh";
        student1.roll = 79;
        System.out.println(student2.name);
        System.out.println(student2.roll);
        System.out.println(student1);
        System.out.println(student1.name);
        System.out.println(student1.roll);


    }

    static class Student{
        String name;
        int roll;
        float marks;

        void greeting(){
            System.out.println("hello! my name is "+ this.name);
        }

        Student(){
            this.name = name;
            this.roll = roll;
            this.marks = marks;
        }

        Student(String name, int roll, float marks){
            this.name = name;
            this.roll = roll;
            this.marks = marks;
        }
    }
}