package com.company;

public class Shark extends Animal {
    private double weight;


    public Shark(String name, int age, String color, double weight) {
        super(name, age, color);
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Shark eats all fish");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "weight=" + weight +
                "} " + super.toString();
    }
    public void getAttack() {
        System.out.println("Shark attacks all animals");
    }
}


