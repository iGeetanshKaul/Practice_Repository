package third;

public class boxprice extends boxnew{
    double price;

    public boxprice() {
        super();
        this.price = 5;
    }

    public boxprice(int length, int breadth, int height, double weight, double price){
        super(length, breadth, height, weight);
        this.price = price;
    }

    @Override
    public void say(){
        System.out.println("I am boxprice");
    }
}