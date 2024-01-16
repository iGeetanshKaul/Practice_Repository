package DynamicStack;

public class Main {
    public static void main(String[] args) {
        StackImplementation mystack1 = new StackImplementation(5);
        StackImplementation mystack2 = new StackImplementation(10);

        //push item onto the stack
        for (int i = 0; i < 6; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 11; i++) {
            mystack2.push(i);
        }

        //pop the items off of the stack
        for (int i = 5; i > -1 ; i--) {
            mystack1.pop();
        }
        for (int i = 10; i > -1; i--) {
            mystack2.pop();
        }
    }
}