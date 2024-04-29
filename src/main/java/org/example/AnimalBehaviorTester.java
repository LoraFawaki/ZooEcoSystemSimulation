package org.example;

public class AnimalBehaviorTester {
    public static void main(String[] args) {

        Animal [] animals = {new Lion("Simba", 10, "Lion"),
                new Elephant("Trupet",40,"Elephant"),
                new Parrot("Chirley", 75,"African Grey" ),
                new Eagle("Bald", 70, "Bald Eagle")};

        for (Animal a:animals){
            a.eat();
            a.makeSound();
            a.sleep();
            a.displayInformation();
        }
    }
}
