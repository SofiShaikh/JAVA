import java.util.Scanner;
public class SumArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int number[]=new int[size];
        System.out.println("enter the elemnts of the array");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        System.out.println("The sum of the array is: " + sum);
        




    }
    
}
