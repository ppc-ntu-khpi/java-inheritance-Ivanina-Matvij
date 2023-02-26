package test;


import domain.wolf;

public class TestAnimal {

    public static void main(String[] args) {

        wolf wolf = new wolf("Patrick");
        System.out.println(wolf);
        wolf.hunt();
        wolf.eat();
        wolf.speak();
        wolf.play();
    }
}