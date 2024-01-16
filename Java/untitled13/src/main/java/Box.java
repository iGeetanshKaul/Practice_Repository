class Box {
    int length;
    int width;
    int breadth;

    double vol(){
        int volume = length * breadth * width;
        return volume;
    }

     void dimensions(int a, int b, int c){
        length = a;
        width = b;
        breadth = c;
    }
}