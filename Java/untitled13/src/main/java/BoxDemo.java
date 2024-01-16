public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
       // double vol = 0.0d;

//        mybox1.length = 10;
//        mybox1.breadth = 20;
//        mybox1.width = 30;
//
//        mybox2.length =23;
//        mybox2.width = 34;
//        mybox2.breadth =23;
        mybox1.dimensions(44, 44, 34);
        mybox2.dimensions(23, 234, 43);


        System.out.println("Volume is =" + mybox1.vol());
        mybox2.vol();
       // vol = mybox.length * mybox.width * mybox.breadth;

       // System.out.println("Volume = "+ );

    }
}