package W3Resource;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Spike" , "Labrador");
        Dog d2 = new Dog("Puff", "German-Shepherd");

        System.out.println(d1.name);
        System.out.println(d2.name);
        System.out.println(d1.breed);
        System.out.println(d2.breed);

        d1.setBreed("Tibetian");
        System.out.println(d1.breed);
        System.out.println(d1.getBreed());
    }
}