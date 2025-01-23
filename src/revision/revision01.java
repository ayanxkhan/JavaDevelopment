package revision;

//Created a class
class Student{
//    Data or attributes
    String name;
    String schoolName;
    int age;

//    Method or member functions
    public void changeSchool(String schoolName){
        this.schoolName = schoolName;
    }

    public void printInfo(String name,int age,String schoolName){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.schoolName);
    }

}

public class revision01 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ak";
        s1.age = 21;
        s1.schoolName = "SMA";

        s1.printInfo("Ayan",21,"SMA");

    }

}
