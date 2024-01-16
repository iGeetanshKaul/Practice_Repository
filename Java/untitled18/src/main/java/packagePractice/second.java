package packagePractice;

public class second implements first{
    public int a =4;
    public void callback(int p){
        System.out.println("callback with "+p);
    }

    public void say(){
        System.out.println("hello it's me");
    }
}