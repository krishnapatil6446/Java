package Basics;
import java.util.Scanner;
public class UserInput{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        System.out.println("Enter First Name" + firstName);
    }
}