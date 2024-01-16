package third;

public class first {
    static int b = 5;

    static{
        System.out.println(b);
    }

    static void staticMethod(int x){
        System.out.println(x);
    }

//    first(int i){
//        this.b = i;
//    }

//    first returnObjectMethod(int i){
//        first temp = new first(b + 10);
//        return temp;
//    }
}