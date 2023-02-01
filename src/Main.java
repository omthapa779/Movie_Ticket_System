import java.util.ArrayList;
import java.util.Scanner;
import Model.Movie;
import Model.Seat;
import Model.Ticket;
import Model.User;

public class Main {
    public static void main(String[] args) {

        Movie m1 = new Movie("sofa","drama","GodFather","Francis Ford Coppola","Friday 8:00PM",700);
        Scanner sc = new Scanner(System.in);
        User user = new User();
        user.addUserInformation();
        System.out.println("--------------------------");

        Movie movie = new Movie();
        System.out.println("--------------------------");

        System.out.println("Enter number of seats: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Seat> seatList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Seat seat = new Seat();
            seat.addSeatInformation();
            seatList.add(seat);
        }
        System.out.println("Number of Seats : " + n);
        Ticket ticket = new Ticket(seatList, user, movie);
        ticket.getTickets();
    }
}