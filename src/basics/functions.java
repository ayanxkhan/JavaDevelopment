package basics;

public class functions {
    public static void printJava(){
        System.out.println("Hello Java");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void printSum(int a,int b){
        int sum  = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        printJava();
        printJava();
        printJava();

        printName("John");

        printSum(10,8);
    }
}