package third;

public class newClass {
     static class InnerClass{
        String name;

        public InnerClass(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        InnerClass a = new InnerClass("Kunal");
        InnerClass b = new InnerClass("Geetansh");

    }
}