//polymorphism revision
package revision;

class Students{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(this.name);
    }

    public void printInfo(int age){
        System.out.println(this.age);
    }

    public void printInfo(String name,int age){
        System.out.println(this.name +" "+ this.age);
    }
}
public class revision02 {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Ayan";
        s1.age = 21;

//        s1.printInfo("Ayan",21);
        s1.printInfo(21);
    }
}
