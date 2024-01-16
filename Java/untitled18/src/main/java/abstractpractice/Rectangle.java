package abstractpractice;

public class Rectangle extends Figure{

    public Rectangle(double a, double b){
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Rectangle");
        return dim1*dim2;
    }


}