package basics;
import java.util.Arrays;
public class array {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 88;
        marks[2] = 99;

        System.out.println(marks[0]);
//   length     here length is an array property that's why we didn't use () after length
        System.out.println(marks.length);

//        sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

//        2D array
        int[][] finalMarks = {{98,96,88},{89,88,99}};
        System.out.println(finalMarks[1][0]);




    }
}