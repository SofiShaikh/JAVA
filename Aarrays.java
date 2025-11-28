import java.util.Scanner;

public class Aarrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine(); // FIX: clear the leftover newline

        String name[] = new String[size];

        // input names
        for(int i = 0; i < size; i++){
            name[i] = sc.nextLine();
        }

        // output names
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }
}
