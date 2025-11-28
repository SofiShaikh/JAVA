
import java.util.Scanner;
public class CheckSorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[]= new int[size];

        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        boolean isSorted=true;

        for(int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
    
}
