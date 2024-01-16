package practice;

public class Main {
    public static void main(String[] args) {
//        BoxWeight box1 = new BoxWeight();
//        BoxWeight box2 = new BoxWeight(2, 4, 5, 6);
//        BoxWeight box3 = new BoxWeight(box2);
//
//        int vol;
//
//        System.out.println(box1.volume());
//       //f System.out.println(box1.weight);
//        System.out.println(box3.volume());
//
//        Shipment ship = new Shipment();
//        Shipment ship1 = new Shipment(23,45,6,56,56);
//        System.out.println(ship1.getCost());
//        ship1.show();


        Box one = new Box();
        BoxWeight two = new BoxWeight();
        Shipment three = new Shipment();

        Box r;

        r = one;
        r.show();

        r = two;
        r.show();

        r = three;
        r.show();

    }
}