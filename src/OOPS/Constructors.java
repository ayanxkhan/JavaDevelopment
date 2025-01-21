package OOPS;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


//   non parameterized constructor
    Student(){
        System.out.println("This is non parameterized constructor");
    }

//    parameterized constructor
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

//    copy constructor
    Student(Student s3){
        this.name = s3.name;
        this.age = s3.age;
    }

}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ayan";
        s1.age = 21;
        s1.printInfo();

        Student s2 = new Student("Aayushi",21);
        s2.printInfo();

        Student s3 = new Student(s2);
        s3.printInfo();

    }
}
