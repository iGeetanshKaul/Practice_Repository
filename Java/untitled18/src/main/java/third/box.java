package third;

public class box {
    private int volume;
    int length;
    int breadth;
    int height;

    public box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public box(int side) {
        this.length = side;
    }

    public box(){
        this.length = 1;
        this.breadth = 2;
        this.height = 3;
    }

    public box(box other){
        this.length = other.length;
        this.height = other.height;
        this.breadth= other.breadth;
    }

    public void say(){
        System.out.println("I am box");
    }

    public static void sayAgain(){
        System.out.println("it's me again!");
    }


}