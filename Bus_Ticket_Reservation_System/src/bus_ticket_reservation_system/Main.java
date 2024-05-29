package bus_ticket_reservation_system;

/**
 *
 * @author shyam
 */
public class Main {

    public static void main(String args[]) {

        UserDetails user = new UserDetails();

        System.out.println("-----------------------------------");
        System.out.println("         Happy    Journey          ");
        System.out.println("-----------------------------------");
        System.out.println("Name : " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Age : " + user.getAge());
        System.out.println("From : " + user.getFrom() + "       To : " + user.getTo());
        System.out.println("No. of Tickets : " + user.getTotalTickets());
        System.out.println("Price : " + user.getTotalPrice());
        System.out.println("-----------------------------------");
    }

}
