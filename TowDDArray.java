import java.util.*;
public class TowDDArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows");
        int rows = sc.nextInt();

        System.out.println("enter number of columns");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        System.out.println("Enter the elements");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the element you want to earch");
        int x= sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(numbers[i][j]==x){
                    System.out.println("found at ("+i+","+j+")");
                }
                
            }
        }
            
    }
}

