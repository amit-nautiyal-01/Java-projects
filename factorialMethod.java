// import java.util.Scanner;

// public class factorialMethod {
//     public static int factorial(int num) {
//         int j=0;
//         for (int i = num; i > 0; i--) {
//             j*=i;}
//         return j;
//     }

//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in);) {
//             int n = sc.nextInt();
//             System.out.println(factorial(n));

//         }
//     }
// }

import java.util.Scanner;

public class factorialMethod {

    public static long factorial(long n) {
        // write your code here
        long fact = 1;
        for (long i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}