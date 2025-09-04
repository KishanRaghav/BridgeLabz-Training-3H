public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("Bob", "Deluxe", 3);
        HotelBooking hb3 = new HotelBooking(hb2);
        hb1.displayDetails();
        hb2.displayDetails();
        hb3.displayDetails();
    }
}
