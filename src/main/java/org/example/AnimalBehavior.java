package org.example;

public interface AnimalBehavior {
    void eat();

    void sleep();

    void makeSound();

}

abstract class Animal implements AnimalBehavior {

    protected String name;
    protected int age;
    protected String type;
    @Override
    public void sleep() {
        System.out.println("ZZZZZzzzzzzz.......");
    }

    public abstract void displayInformation();

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

}

