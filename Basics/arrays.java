import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        
    //int intArray[];
    //OR int[] intArray; DECLARATION
    // age = new int[5] // ALLOCATION

    // int age[]= new int [5];
    // age [0] = 2;
    // age [1] = 5;
    // System.out.println(age[0]);
    // System.out.println(age[1]);
    // System.out.println(age[2]);

    // int marks[] = {11,23,43,54,29};
    // System.out.println(marks[4]);
    
    // String names[]= {"Raj", "Krishna", "Raju", "Ram", "Karan"};
    // for (int i = 0; i< names.length;i++){
    //     System.out.println("Name is : "+ names[i]);
    // }    

    // // FOR EACH LOOP

    // for(String name: names){
    //     System.out.println("For each : " + name);
    // }

    // int numbers [] = {12,1,22,34,31,52,89,8};
    // int sum = 0;
    // for (int number: numbers){
    //     sum+=number;
    // }
    // for (int i=0; i<numbers.length ;i++){
        
    // }
    //  System.out.println("the value is : " + sum);


    // 2D ARRAYS OR MATRIX
    int marks [][] = {
        {12,23,34},
        {45,54,76},
        {12,67,60},
        {91,28,75}
    };  // row-> roll no, column->subject number;
    System.out.println(marks[0][2]);
    System.out.println(marks[3][1]);

        
    // marks[0][0] = 56;
    // marks[0][1] = 91;
    // marks[0][2] = 72;

    // marks[1][0] = 67;
    // marks[1][1] = 90;
    // marks[1][2] = 79;

    // marks[2][0] = 56;
    // marks[2][1] = 91;
    // marks[2][2] = 72;

    // marks[3][0] = 67;
    // marks[3][1] = 90;
    // marks[3][2] = 79;    



}
}
