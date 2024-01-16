package JavaPointQuestions.ArraysPrograms;

public class Bicycle {
   public float version = 1.0f;
   public static int gear = 0;
   public int speed = 0;
   public int brake = 0;
   public static int numbers = 0;

    public Bicycle(){
        numbers += 1;
    }

    public static boolean compareBicycles(Bicycle one, Bicycle two){
        return one.equals(two);
    }

    public static void compareBicyclesObjectsMaxSpeed(Bicycle one, Bicycle two){
        System.out.println(((one.gear < two.gear) ? "two" : "one"));
    }

    public Bicycle(float version, int speed, int brake) {
        this.version = version;
        this.speed = speed;
        this.brake = brake;
        numbers += 1;
    }

    void changeGear(int gear){
        this.gear = gear;
    }

    void speedUp(int increment){
        this.speed += increment;
    }

    void brake(int decrement){
        this.speed -= decrement;
    }
    void showStatesAndBehaviour(){
        System.out.println("Version: " + version);
        System.out.println("Gear: " + gear);
        System.out.println("Speed: " + speed);
        System.out.println("Brake: " + brake);
    }
}