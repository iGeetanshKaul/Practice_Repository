package Exception;

public class Ex1 {
    public static void main(String[] args) {
       try{
           int a = 0;
           int b = 5/a;
           System.out.println(b);
       }catch (ArithmeticException e){
           System.out.println("Division by zero");
       }

       try {
           int a = 0;
           int b = 45 / a;
       }catch (ArithmeticException e){
           System.out.println("Generic Exception catch");
       }catch(Exception e){
           System.out.println("exception caught");

       }
    }
}