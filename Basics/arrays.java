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

    int numbers [] = {12,1,22,34,31,52,89,8};
    int sum = 0;
    for (int number: numbers){
        sum+=number;
    }
    for (int i=0; i<numbers.length ;i++){
        
    }
     System.out.println("the value is : " + sum);

}
}
