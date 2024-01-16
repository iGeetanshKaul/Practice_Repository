package Exception;

public class throwpractice extends customException {
    static void demo(){

        try {
            throw new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("nullpoinder exc");
            throw e;
        }
    }

    public static void main(String[] args) {
        customException c = new customException();
        try{
            demo();
        }catch (NullPointerException e){
           c.getClass();
        }
    }
}