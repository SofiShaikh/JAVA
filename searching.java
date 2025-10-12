import java.util.*;

public class searching {
    public static int Linear_search(int arr[], int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 35, 40, 55, 27};
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        int ans = Linear_search(arr, target);
        System.out.println(ans);
    }
}