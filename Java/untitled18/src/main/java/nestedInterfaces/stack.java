package nestedInterfaces;

public class Stack implements stack{
    private int[] stack;
    private int tos;

    Stack(int size){
        this.stack = new int[size];
        this.tos = -1;
    }

    public void push(int item){
        if(tos == stack.length - 1){
            System.out.println("Stack is full");
        }else stack[++tos] = item;
    }
    public int pop(){
      if(tos < 0){
          System.out.println("The stack is empty");
          return 0;
      }else {
          int temp = stack[tos];
          stack[tos] ^= 0;
      }
        return stack[tos--];
    }
}