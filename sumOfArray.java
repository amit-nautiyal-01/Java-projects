import java.util.Scanner;

public class sumOfArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the array size
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // read the array elements
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // read the two numbers to check
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // check if n and m never occur next to each other
        boolean found = false;
        for (int i = 0; i < size - 1; i++) {
            if ((arr[i] == n && arr[i + 1] == m) || (arr[i] == m && arr[i + 1] == n)) {
                found = true;
                break;
            }
        }

        System.out.println(!found);
    }
}