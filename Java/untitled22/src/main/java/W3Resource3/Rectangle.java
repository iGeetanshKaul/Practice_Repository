package W3Resource3;

public class Rectangle {
    int height;
    int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return getAreaRectangle();
    }

    private int getAreaRectangle() {
        return this.width*this.height;
    }

    public int getPerimeter(){
        return getPerimeterRectangle();
    }

    private int getPerimeterRectangle() {
        return (2*(this.width + this.height));
    }
}