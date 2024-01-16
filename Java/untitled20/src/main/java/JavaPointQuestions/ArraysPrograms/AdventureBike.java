package JavaPointQuestions.ArraysPrograms;

public class AdventureBike extends Bicycle implements Engine{
    float version = super.version + 1;
    int gear = 0;
    int speed = 0;
    int brake = 0;
    int seatHeight = 0;
    double engine = 0;
    int engineGear = 0;


    public void setEngine(double engine){
        this.engine = engine;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBrake() {
        return brake;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public double getEngine() {
        return engine;
    }

    public int getEngineGear() {
        return engineGear;
    }

    public void setEngineGear(int engineGear) {
        this.engineGear = engineGear;
    }

    public void setEngineGears(int engineGears){
        this.engineGear = engineGears;
    }

    public AdventureBike(){

    }

    public AdventureBike(float version, int speed, int brake, int seatHeight) {
        super(version, speed, brake);
        this.seatHeight = seatHeight;
    }

    void changeSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
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