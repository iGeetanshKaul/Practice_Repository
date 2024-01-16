public class Hello {

  class StaticDemo{
      static int a=10;
      public static class disp{
      static void display(){
          System.out.println("STATIC DISPLAYED");
      }}
      static {
          System.out.println("STATIC BLOCK");
      }
  }

  class main{
      public static void Hello(String[] args) {
          System.out.println(StaticDemo.a);
          StaticDemo.disp.display();
      }
  }
}