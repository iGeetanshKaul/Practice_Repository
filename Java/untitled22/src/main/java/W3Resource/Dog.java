package W3Resource;

public class Dog {
    String name;
    String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName(){
        return this.name;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
}