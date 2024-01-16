package practice;

public class Box {
    private int length;
    private int breadth;
    private int height;

     public Box() {
         this.length = -1;
         this.breadth = -1;
         this.height = -1;
     }

     public Box(int length, int breadth, int height){
         this.length = length;
         this.breadth = breadth;
         this.height = height;
     }

     public Box(int side){
         this.length = this.breadth = this.height;
     }

     int volume(){
         return (this.length * this.breadth * this.height);
     }

     public Box(Box other){
         this.length = other.length;
         this.breadth = other.breadth;
         this.height = other.height;
     }

     void show(){
         System.out.println("I am awesome in Box");
     }





    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}