import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int number[]=new int[size];
        System.out.println("enter the elements in the array");

        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();

        }
        System.out.println("The reversed array is: ");
        for(int i=size-1;i>=0;i--){
            System.out.print(number[i] + " ");
        }
    }
    
}
