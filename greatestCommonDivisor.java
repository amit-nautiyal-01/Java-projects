// import java.util.Scanner;

// public class greatestCommonDivisor {
//     public static int gcd(int a, int b) {
//         while (b > 0) {
//             int c = a % b;
//             a = b;
//             b = c;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in);) {
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             System.out.println(gcd(a, b));
//         }
//     }
// }

import java.util.Scanner;

public class greatestCommonDivisor {

    public static boolean isComposite(long number) {
        for (long i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return true;
            }
        } 
        return false;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final long number = scanner.nextLong();
            System.out.println(isComposite(number));
    }
}