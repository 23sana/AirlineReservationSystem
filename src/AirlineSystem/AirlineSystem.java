package AirlineSystem;

import java.util.Scanner;

public class AirlineSystem {

    static String passengerName;
    static String flightName;
    static int seatNumber;
    static boolean booked = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n✈️ AIRLINE RESERVATION SYSTEM ✈️");
            System.out.println("1. View Flights");
            System.out.println("2. Book Ticket");
            System.out.println("3. View Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    showFlights();
                    break;

                case 2:
                    bookTicket(sc);
                    break;

                case 3:
                    viewBooking();
                    break;

                case 4:
                    System.out.println("Thank you for using Airline System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    static void showFlights() {
        System.out.println("\nAvailable Flights:");
        System.out.println("1. Air India");
        System.out.println("2. Indigo");
        System.out.println("3. Emirates");
        System.out.println("4. SpiceJet");
    }

    static void bookTicket(Scanner sc) {
        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Flight Name: ");
        flightName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        seatNumber = sc.nextInt();

        booked = true;

        System.out.println("\n✅ Ticket Booked Successfully!");
    }

    static void viewBooking() {
        if (booked) {
            System.out.println("\n📄 Booking Details:");
            System.out.println("Passenger: " + passengerName);
            System.out.println("Flight: " + flightName);
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("\n❌ No Booking Found!");
        }
    }
}

