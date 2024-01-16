package JavaPointQuestions.ArraysPrograms;

public class CycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        AdventureBike bike2 = new AdventureBike();

        bike1.speedUp(10);
        bike2.speedUp(10);
        bike1.brake(5);
        bike2.brake(5);
        bike1.changeGear(3);
        bike2.changeGear(3);
        bike1.brake(2);
        bike2.brake(2);
        bike1.changeGear(1);
        bike2.changeGear(1);
        bike1.showStatesAndBehaviour();
        bike2.showStatesAndBehaviour();

        System.out.println(bike1.equals(bike2));

        int hex = 0xff1a;
        int binary = 0b1010;
        System.out.println(hex + " " + binary);

        bike2.setEngine(2.0);
        bike2.setEngineGears(3);
        System.out.println(bike2.engine);





        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.println();
        System.out.println(Bicycle.compareBicycles(bike1,bike2));

        float version = new AdventureBike(100.3f,5, 5, 6 ).getVersion();
        System.out.println(version);


       // Bicycle bike3 = new Bicycle();
        Bicycle bike4 = new Bicycle();
        Bicycle.compareBicyclesObjectsMaxSpeed(bike2,bike4);
        System.out.println(Bicycle.numbers);
        Bicycle bike5 = new Bicycle();
        System.out.println(Bicycle.numbers);
        System.out.println(bike5.numbers);


    }
}