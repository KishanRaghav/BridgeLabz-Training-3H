import java.util.*;
public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeats = 10;      
        int bookedSeats = 0;      
        int waitingList = 4;      
        int waitingCount = 0;

        System.out.println("choose your train optiion ");
        int choice = sc.nextInt();
        int fare = 0;
        switch (choice) {
            case 1:
                fare = 500;
                System.out.println("You selected Express Train");
                break;
            case 2:
                fare = 1500;
                System.out.println("You selected superfast Train");
                break;
            case 3:
                fare = 300;
                System.out.println("You selected Local Train)");
                break;
                 default:
                System.out.println("Invalid choice. Default Express Train selected.");
                fare = 500;
                 
        }
        char moreBooking;
        do {
            System.out.println("Enter number of passengers to book:");
            int n = sc.nextInt();

            
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter Passenger " + i + " name: ");
                String name = sc.next();

        
                if (bookedSeats < totalSeats) {
                    bookedSeats++;
                    System.out.println("Seat confirmed for " + name + ". Seat No: " + bookedSeats);
                } else {
                   
                    if (waitingCount < waitingList) {
                        waitingCount++;
                        System.out.println("No seat available. " + name + " added to Waiting List (WL" + waitingCount + ")");
                    } else {
                        System.out.println("Sorry, no seat or waiting list available for " + name);
                    }
                }
            }
        
            System.out.println("Do you want to make another booking? (y/n)");
            moreBooking = sc.next().charAt(0);

        }
        while (moreBooking == 'y' || moreBooking == 'Y');

        System.out.println("Final Booking Summary:");
        System.out.println("Total Confirmed Seats: " + bookedSeats);
        System.out.println("Total Waiting List: " + waitingCount);
        System.out.println("Fare per passenger: " + fare);
        System.out.println("Thank you for using Railway Reservation System!");
        

    }
    
}










           
    



