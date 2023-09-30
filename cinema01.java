import java.util.Scanner;

public class cinema01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows and seats in each row
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int numSeatsPerRow = scanner.nextInt();

        // Create the cinema seating arrangement array
        char[][] seats = new char[numRows][numSeatsPerRow];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeatsPerRow; j++) {
                seats[i][j] = 'S'; // S for available seats
            }
        }

        // Print the initial seating arrangement
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j = 1; j <= numSeatsPerRow; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < numRows; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < numSeatsPerRow; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        // Read the seat coordinates and calculate the ticket price
        System.out.println("Enter a row number:");
        int rowNumber = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int seatNumber = scanner.nextInt();

        int totalSeats = numRows * numSeatsPerRow;
        int ticketPrice;
        if (totalSeats <= 60) {
            ticketPrice = 10;
        } else {
            int frontHalfRows = numRows / 2;
            if (rowNumber <= frontHalfRows) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        }

        // Mark the chosen seat with 'B'
        seats[rowNumber-1][seatNumber-1] = 'B';

        // Print the final seating arrangement and ticket price
        System.out.println("Ticket price: $" + ticketPrice);
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j = 1; j <= numSeatsPerRow; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < numRows; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < numSeatsPerRow; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}

