package JavaPointQuestions.ArraysPrograms;

public class testSTringbuffer {
    public static void main(String[] args) {
        String first = "Geetansh";
        String second = "Geetansh";
        String fourth = "Rahul";
        fourth = "hello";
       // first = "Kunal";
        String third = new String("Geetansh");
        System.out.println(first);
        System.out.println(second.equals(first));
        System.out.println(second==first);
        System.out.println(first==third);
        System.out.println(first.equals(third));
        System.out.println(fourth);

        System.out.println("#####################");
        StringBuffer buffer = new StringBuffer();
        buffer.append("hello");
        System.out.println(buffer);

    }
}