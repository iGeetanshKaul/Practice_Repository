package abstractpractice;

public class Triangle extends Figure{

    public Triangle(double a, double b){
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Triangle");
        return dim1*dim2;
    }
}