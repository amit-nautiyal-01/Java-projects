// import java.util.Scanner;
// public class creatingFunction {
//     public static void main(String[] args) {
//         try(Scanner scanner = new Scanner(System.in);){
//             int num = scanner.nextInt();

//         }
//     }
//     public int sign(){
//         if(num>0){
//             System.out.println("+1");
//         }else if(num>0){
//             System.out.println("+1");
//         }else{
//             System.out.println("+1");
//         }
//     }
// }

import java.util.Scanner;

public class creatingFunction {

    public static int sign(int number) {
        // write your code here
        if (number > 0) {
            return +1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}