package com.company;

public class Eagle extends Animal {
    private String wings;


    public Eagle(String name, int age, String color, String wings) {
        super(name, age, color);
        this.wings = wings;
    }

    @Override
    public void eat() {
        System.out.println("Eagle eats meat");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "wings='" + wings + '\'' +
                "} " + super.toString();
    }
    public void getFly() {
        System.out.println("The eagle flies high");
    }
}

