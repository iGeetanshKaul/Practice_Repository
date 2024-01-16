package fifthPackage;

;

public class Stringbuilder {
    public static void main(String[] args) {


        String[] str = {"ada", "hello", "uou"};
        String name = "Geetansh";
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        System.out.println(builder);
        builder.delete(0,name.length());
        System.out.println(builder);



        for (int i = 0; i < str.length; i++) {
            String temep = str[i];
            System.out.println(temep);


        }
    }
}