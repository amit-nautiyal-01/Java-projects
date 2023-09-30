import java.util.Scanner;

public class alphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings in the array: ");
        int n = scanner.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        if (isInAlphabeticalOrder(arr)) {
            System.out.println("The array is in alphabetical order.");
        } else {
            System.out.println("The array is NOT in alphabetical order.");
        }
    }

    public static boolean isInAlphabeticalOrder(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int cmp = arr[i].compareTo(arr[i + 1]);
            if (cmp > 0) {
                return false;
            }
        }
        return true;
    }
}
