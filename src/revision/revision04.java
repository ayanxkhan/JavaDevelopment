//Abstraction revision
package revision;

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

public class revision04 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.walk();

//        here error occurs because it is absract class or just a blueprint for others.
//        Animal a1 = new Animal();
//        a1.walk();
    }
}
