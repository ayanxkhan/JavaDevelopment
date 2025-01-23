//Inheritance revision
package revision;

class Car{
    String color;
    String type;
}

class Volkswagen extends Car{

}

public class revision03 {
    public static void main(String[] args) {
        Volkswagen v1 = new Volkswagen();
        v1.color = "White";
        System.out.println(v1.color);
    }
}
