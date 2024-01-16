public class second {
    public static void main(String[] args) {
        first kunal = new first();
        first Geetansh = new first(100, 100);
        first Gettu = new first(100, 100);

        System.out.println(kunal.marks);
        System.out.println(kunal.name);
        System.out.println(Geetansh.marks);
        System.out.println(Geetansh.equalsTo(Gettu));

    }
}