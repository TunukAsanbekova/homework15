package com.company;

public class Main {

    public static void main(String[] args) {

       Animal shark = new Shark("Bom", 6, "white", 2000);


        Animal turtle = new Turtle("Jame", 10, "Black", 45);


        Animal eagle = new Eagle("Kind", 25, "BlackWhite", "Huge");

        Animal[] animals = {shark, turtle, eagle};
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                System.out.println(animal);
                ((Shark) shark).getAttack();
                animal.eat();
            }
            if (animal instanceof Turtle) {
                System.out.println(animal);
                ((Turtle) turtle).getSwim();
                animal.eat();
            }
            if (animal instanceof Eagle) {
                System.out.println(animal);
                ((Eagle) eagle).getFly();
                animal.eat();
            }

        }
    }
}
