package ExceptionHandling;

//whenever we have io exceptions all objects become resources
import java.io.BufferedReader;
import java.io.InputStreamReader;

//try block with resources
public class demo05 {
//    here throws exception helps to recognize exception and handles it
    public static void main(String[] args) throws Exception {
//        no need to create br outside also
//        BufferedReader br = null;

//        now here all the part will be done by try ie closing resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            String str = "";
            //        here br is a resource so we have to close it.
//            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
        }

//        catch (Exception e){
//            System.out.println(e);
//    }

//        instead of closing resources in finally do it in try block
//        finally {
//            br.close();
//
//        }


    }
}
