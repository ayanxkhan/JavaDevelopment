package ExceptionHandling;

public class demoException {
    public static void main(String[] args) {
//        int k = 0;
//        int i = 8;
//        int j = 2;
//this will run properly and the output will be 4
//        k = i/j;
//        System.out.println(k);


//        int k = 0;
//        int i = 8;
//        int j = 0;
//
//        k = i/j;
//        System.out.println(k);
//        this above code will throw an exception called ArithmeticException coz we are dividing it by 0
//        so to avoid this we write it in try block(whichever statement that throws exception)
//        and create a catch block to resolve it and to continue the flow of program


        int k = 0;
        int i = 8;
        int j = 0;

        try{
            k = i/j;
        }
        catch (Exception e){
//            System.out.println(e); or
            System.out.println("Cannot divide by zero " + e);

        }
        System.out.println(k);

    }
}

//the above code is example of unchecked exception