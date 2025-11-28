import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input size
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input array elements
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // input x
        int x = sc.nextInt();

        // output (linear search)
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
}
