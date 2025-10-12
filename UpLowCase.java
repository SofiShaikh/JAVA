import java.util.*;
import java.util.Scanner;
public class UpLowCase{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string");
        String input=sc.nextLine();
        
        System.out.println("Uppercase: "+input.toUpperCase());
        System.out.println("Lowercase: "+input.toLowerCase());
        
        sc.close();
    }
}