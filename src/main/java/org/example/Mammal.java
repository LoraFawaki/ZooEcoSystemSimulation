package org.example;

public class Mammal extends Animal{


    @Override
    public void displayInformation() {
        System.out.println("This is a " + type + " its name is " + name + " it lives up to " + age);
    }

    public Mammal(String name, int age, String type) {
        super(name, age, type);
    }


    @Override
    public void eat() {
        System.out.println("Mammals eat");
    }

    @Override
    public void makeSound() {
        System.out.println("Mammals make sound ");
    }

}

class Lion extends Mammal{

     public Lion(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void eat() {
        System.out.println("Lions are Carnivorous, They eat meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Lions Roars");
    }


}
class Elephant extends Mammal{

    public Elephant(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void eat() {
        System.out.println("Elephants are herbivorous, they eat tree leaves");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant sound is called: Trumpt");
    }

}






