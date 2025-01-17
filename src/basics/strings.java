package basics;

public class strings {
    public static void main(String[] args){
        String firstName = "John";
        String lastName = "Doe";

//        concatenation
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

//        charAt
        System.out.println(firstName.charAt(3));

//        length
        System.out.println(lastName.length());

//        replace
        String newName=firstName.replace('J','S');
        System.out.println(newName);

//        substring
        System.out.println(fullName.substring(0,3));
    }
}