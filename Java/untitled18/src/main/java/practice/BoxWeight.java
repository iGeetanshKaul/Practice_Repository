package practice;

public class BoxWeight extends Box{
    private int weight;

    public BoxWeight(){
        super();
        this.weight = -1;
    }

    public BoxWeight(int length, int breadth, int height, int weight){
        super(length, breadth, height);
        this.weight = weight;
    }

    public BoxWeight(int side, int weight){
        super(side);
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    @Override
    void show(){
      //  super.show();
        System.out.println("I am awesome in BoxWeight");
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

}