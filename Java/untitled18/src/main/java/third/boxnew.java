package third;

public class boxnew extends box {
    double weight;

    public boxnew() {
        super();
        this.weight = 4;
    }

    public boxnew(int length, int breadth, int height, double weight) {
        super(length, breadth, height);
        this.weight = weight;
    }

    @Override
    public void say(){
        System.out.println("I am boxnew");
    }

    //@Override
    public static void sayAgain(){
        System.out.println("Its me boxnew again!");
    }

}