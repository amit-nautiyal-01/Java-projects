import java.util.Scanner;

public class cinemaAtStage4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int numSeatsPerRow = scanner.nextInt();

        char[][] seatingArrangement = new char[numRows][numSeatsPerRow];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeatsPerRow; j++) {
                seatingArrangement[i][j] = 'S';
            }
        }

        while (true) {
            System.out.println("\n1. Show the seats\n2. Buy a ticket\n0. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    return;
                case 1:
                    printSeatingArrangement(seatingArrangement);
                    break;
                case 2:
                    int[] seatCoordinates = readSeatCoordinates(scanner, numRows, numSeatsPerRow);
                    int ticketPrice = getTicketPrice(numRows, numSeatsPerRow, seatCoordinates);
                    System.out.println("Ticket price: $" + ticketPrice);
                    seatingArrangement[seatCoordinates[0]-1][seatCoordinates[1]-1] = 'B';
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }

    public static void printSeatingArrangement(char[][] seatingArrangement) {
        System.out.println("\nCinema:");
        System.out.print(" ");
        for (int i = 1; i <= seatingArrangement[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 0; i < seatingArrangement.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < seatingArrangement[i].length; j++) {
                System.out.print(" " + seatingArrangement[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] readSeatCoordinates(Scanner scanner, int numRows, int numSeatsPerRow) {
        while (true) {
            System.out.println("\nEnter a row number:");
            int row = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            int seat = scanner.nextInt();

            if (row < 1 || row > numRows || seat < 1 || seat > numSeatsPerRow) {
                System.out.println("Wrong input!");
            } else {
                return new int[]{row, seat};
            }
        }
    }

    public static int getTicketPrice(int numRows, int numSeatsPerRow, int[] seatCoordinates) {
        int totalNumSeats = numRows * numSeatsPerRow;
        int frontHalfPrice = numRows / 2 * numSeatsPerRow * 10;
        int backHalfPrice = (numRows - numRows / 2) * numSeatsPerRow * 8;

        if (totalNumSeats <= 60) {
            return 10;
        } else if (seatCoordinates[0] <= numRows / 2) {
            return 10;
        } else {
            return 8;
        }
    }
}
