package basics;

public class exceptionHandling {
    public static void main(String[] args) {
        int[] marks = {98,97,77};

        try{
            System.out.println(marks[5]);
        }
        catch (Exception exception){
            System.out.println("This message gets printed even the above code throws exception");
        }
    }
}