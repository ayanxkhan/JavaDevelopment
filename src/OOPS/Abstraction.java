package OOPS;


//Created an abstract class which is just a blueprint for other classes.
abstract class Animal{
    public void walk(){

    };
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();

//        error beacuse Animal is abstract;it cannot be instantiated.
//        Animal animal = new Animal();
    }

}
