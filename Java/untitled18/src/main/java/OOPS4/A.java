package OOPS4;

public class A {
    private int a;
    public int c;
    protected int b;
    int d;

    public A(){
        this.a = 0;
        this.b = 1;
        this.c = 2;
        this.d = 3;
    }

    public A(int a, int c, int b, int d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}