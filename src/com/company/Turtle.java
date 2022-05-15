package com.company;

public class Turtle extends Animal {
    private int size;


    public Turtle(String name, int age, String color, int size) {
        super(name, age, color);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("turtle eating a leaf");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "size=" + size +
                "} " + super.toString();
    }
    public void getSwim() {
        System.out.println("Turtle can swim");
    }
}

