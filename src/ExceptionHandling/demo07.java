package ExceptionHandling;
//user defined exception
public class demo07 {
    public static void main(String[] args) {
        int i = 5;

       try
       {
           if(i<10)
           {
               throw new MyException("This error message is given by the user");
           }
       }

       catch (Exception e){
           System.out.println(e);
       }
    }
}

//creating user defined exception
class MyException extends Exception{

    public MyException(String msg){
//        now to give error message we use super() which will call consrtuctor of exception class
        super(msg);

    }

}
