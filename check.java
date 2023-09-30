import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();

        char[][] cinema = new char[rows][seatsPerRow];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                cinema[i][j] = 'S'; // 'S' stands for "Available"
            }
        }

        int totalSeats = rows * seatsPerRow;
        int currentIncome = 0;
        int totalIncome = 0;
        int purchasedTickets = 0;

        if (totalSeats <= 60) {
            totalIncome = totalSeats * 10;
        } else {
            int frontHalf = rows / 2;
            int backHalf = rows - frontHalf;
            totalIncome = frontHalf * seatsPerRow * 10 + backHalf * seatsPerRow * 8;
        }

        while (true) {
            System.out.println("\n1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nCinema:");
                    System.out.print("  ");
                    for (int i = 1; i <= seatsPerRow; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();

                    for (int i = 0; i < rows; i++) {
                        System.out.print(i + 1 + " ");
                        for (int j = 0; j < seatsPerRow; j++) {
                            System.out.print(cinema[i][j] + " ");
                        }
                        System.out.println();
                    }

                    break;
                case 2:
                    int rowNumber = 0;
                    int seatNumber = 0;
                    while (true) {
                        System.out.println("\nEnter a row number:");
                        rowNumber = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        seatNumber = scanner.nextInt();

                        if (rowNumber < 1 || rowNumber > rows || seatNumber < 1 || seatNumber > seatsPerRow) {
                            System.out.println("Wrong input!");
                        } else if (cinema[rowNumber - 1][seatNumber - 1] == 'B') {
                            System.out.println("That ticket has already been purchased!");
                        } else {
                            break;
                        }
                    }

                    int ticketPrice = 0;
                    if (totalSeats <= 60) {
                        ticketPrice = 10;
                    } else {
                        if (rowNumber <= rows / 2) {
                            ticketPrice = 10;
                        } else {
                            ticketPrice = 8;
                        }
                    }

                    System.out.println("Ticket price: $" + ticketPrice);
                    cinema[rowNumber - 1][seatNumber - 1] = 'B'; // 'B' stands for "Booked"
                    currentIncome += ticketPrice;
                    purchasedTickets++;

                    break;
                case 3:
                    double percentage = (double) purchasedTickets / totalSeats * 100;

                    System.out.println("\nNumber of purchased tickets: " + purchasedTickets);
                    System.out.printf("Percentage: %.2f%%\n", percentage);
                    System.out.println("Current income: $" + currentIncome);
            }
        }
    }
}
