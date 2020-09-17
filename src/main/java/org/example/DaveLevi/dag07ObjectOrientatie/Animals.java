package org.example.DaveLevi.dag07ObjectOrientatie;

public class Animals {
    private String animalType;
    private int age;
    private boolean omnivore;
    private String colour;
    private int hoursOfSleep;

    Animals(String newAnimalType, int newAge, boolean newOmnivore, String newColour, int newhoursOfSleep){
        setAnimalType(newAnimalType);
        setAge(newAge);
        setColour(newColour);
        setHoursOfSleep(newhoursOfSleep);
    }


    String getanimalType() {
        return animalType;
    }
    int getAge(){
        return age;
    }
    boolean getOmnivore(){
        return omnivore;
    }
    String getColour(){
        return colour;
    }
    int getHoursOfSleep() {
        return hoursOfSleep;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setOmnivore(boolean omnivore) {
        this.omnivore = omnivore;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setHoursOfSleep(int hoursOfSleep) {
        this.hoursOfSleep = hoursOfSleep;
    }

    public String toString(){
        return "This animal is a " + animalType + " , it is " + age + " years old, its colour is " + colour + " and this animal requires " + hoursOfSleep + " hours of sleep per day";
            }
}
