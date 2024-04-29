package org.example;

public class Bird extends Animal{


    @Override
    public void displayInformation() {
        System.out.println("This is a " + type + " its name is " + name + " it lives up to " + age);
    }

    public Bird(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void eat() {
        System.out.println("Birds eat");
    }

    @Override
    public void makeSound() {
        System.out.println("Birds make sound");
    }

    }

class Eagle extends Bird{

    public Eagle(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void eat() {
        System.out.println("Eagles eat their preys");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagles make a series of chirping whistles");
    }

}

class Parrot extends Bird{

    public Parrot(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void eat() {
        System.out.println("Parrots eat seeds and fruits");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrots are recognized for their distinctive vocalizations including loud squawks, chirps, cackles, and whistles.");
    }

}

