package first;

public class first {
    int outer_a = 3;

    void test(){
        inner in = new inner();
        in.display();
    }

    class inner {
        int y = 20;

        void display(){
            System.out.println("outer_x = " + outer_a);
        }
    }


}