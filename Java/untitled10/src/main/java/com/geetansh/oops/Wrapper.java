package com.geetansh.oops;

public class Wrapper {
    public static void main(String[] args) {
       final A obj = new A("kunal");
        obj.name = "geetansh";

        obj = new A("dus");



    }

    public static class A {
        final int num = 10;
        String name;

        public A(String name) {
            this.name = name;
        }
    }
}