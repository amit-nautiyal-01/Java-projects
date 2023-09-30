import java.util.Scanner;

public class simpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            Long val1 = scanner.nextLong();
            char ch = scanner.next().charAt(0);
            Long val2 = scanner.nextLong();
            switch (ch) {
                case '+':
                    System.out.println(val1 + val2);
                    break;
                case '-':
                    System.out.println(val1 - val2);
                    break;
                case '*':
                    System.out.println(val1 * val2);
                    break;
                case '/':
                    if (val2 == 0) {
                        System.out.println("Division by 0!");
                        break;
                    }
                    System.out.println(val1 / val2);
                    break;
                default:
                    System.out.println("Unknown operator");
            }

        }
    }
}
