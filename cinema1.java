
import java.util.*;

public class cinema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numSeats = scanner.nextInt();

        char[][] seats = new char[numRows][numSeats];
        int totalSeats = numRows * numSeats;
        boolean isLargeRoom = totalSeats > 60;
        int ticketPrice = isLargeRoom ? 8 : 10;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeats; j++) {
                seats[i][j] = 'S';
            }
        }

        if (isLargeRoom) {
            int halfRows = (numRows + 1) / 2;
            for (int i = halfRows; i < numRows; i++) {
                for (int j = 0; j < numSeats; j++) {
                    seats[i][j] = 'B';
                }
            }
        }

        System.out.println("Cinema:");
        for (int i = 0; i <= numRows; i++) {
            for (int j = 0; j <= numSeats; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("  ");
                } else if (i == 0) {
                    System.out.print(j + " ");
                } else if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(seats[i - 1][j - 1] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Enter a row number:");
        int chosenRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int chosenSeat = scanner.nextInt();
        System.out.printf("Ticket price: $%d\n", seats[chosenRow - 1][chosenSeat - 1] == 'B' ? ticketPrice : 10);
        seats[chosenRow - 1][chosenSeat - 1] = 'B';

        System.out.println("Cinema:");
        for (int i = 0; i <= numRows; i++) {
            for (int j = 0; j <= numSeats; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("  ");
                } else if (i == 0) {
                    System.out.print(j + " ");
                } else if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(seats[i - 1][j - 1] + " ");
                }
            }
            System.out.println();
        }
    }
}