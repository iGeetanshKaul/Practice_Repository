package DynamicStack;

public class StackImplementation implements Stack {
    private int[] stack;
    private int tos;

    public StackImplementation(int size) {
        stack = new int[size];
        this.tos = -1;
    }

    @Override
    public void push(int item) {
        if(tos == stack.length - 1){
            System.out.println("Stack is full");
            System.out.println("hence creating stack , double the size");
            int[] temp = new int[stack.length * 2];
            stack = temp;
            System.out.println("size "+stack.length);
        }else stack[++tos] = item;
    }

    public void pop(){
        if(tos < 0){
            System.out.println("the stack is empty");
        }else {
            stack[tos] ^= 0;
            tos--;
        }

    }
}