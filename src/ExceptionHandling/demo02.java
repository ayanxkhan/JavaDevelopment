package ExceptionHandling;

//two catch with one try block
public class demo02 {
    public static void main(String[] args) {
        int i = 8;
        int j = 2;
        int k = 0;

        int [] arr = new int[4];

        try{
            k = i/j;
            for(int c = 0;c<=4;c++){
                arr[c] = c+1;
            }

            for(int val : arr){
                System.out.println(val);
            }
        }

        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero " + e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum number of value is 4 ");
        }
    }
}
