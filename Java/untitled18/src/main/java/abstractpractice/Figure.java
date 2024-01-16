package abstractpractice;

import java.awt.*;

public abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        this.dim1 = a;
        this.dim2 = b;
    }

    abstract double area();
}