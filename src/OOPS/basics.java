package OOPS;

//created a class called Pen
class Pen{
//    These are attributes or data
    String color;
    String type;

//    Here write is a method or a function written inside class
    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}
public class basics {
    public static void main(String[] args) {
        //    Object Creation
        Pen pen1 = new Pen();

//        Object Initialization
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen1.printColor();
        pen2.printColor();
    }
}
