package OOPS;

interface Animals{
    public void walk();

//    Constructor not allowed
//   Animals(){
//
//   }

//    Non abstract method not allowed
//    void eat(){
//
//    }


}

class Horses implements Animals{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }

}

public class Interface {
    public static void main(String[] args) {
        Horses horse = new Horses();
        horse.walk();

    }
}
