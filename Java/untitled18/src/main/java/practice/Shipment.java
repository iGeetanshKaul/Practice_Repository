package practice;

public class Shipment extends BoxWeight{
    private int cost;

    public Shipment(){
        super();
        this.cost = -1;
    }

    public Shipment(int length, int breadth, int height, int weight, int cost){
        super(length, breadth, height, weight);
        this.cost = cost;
    }

    public Shipment(int side, int weight, int cost){
        super(side, weight);
        this.cost = cost;
    }

    public Shipment(Shipment other, int cost){
        super(other);
        this.cost = cost;
    }

    @Override
    void show(){
       // super.show();
        System.out.println("I am awesome Shipment");
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}