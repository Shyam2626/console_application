package bus_ticket_reservation_system;

import java.util.Scanner;

public class UserDetails {

    private String firstName;
    private String lastName;
    private int age;
    private String from;
    private String to;
    private int totalTickets;
    private int totalPrice;

    Scanner sc = new Scanner(System.in);

    public UserDetails() {

        System.out.println("Enter Your First Name :");
        this.firstName = sc.nextLine();

        System.out.println("Enter Your Last Name :");
        this.lastName = sc.nextLine();

        System.out.println("Enter Your Age :");
        this.age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Your Pickup point :");
        this.from = sc.nextLine().toLowerCase();

        System.out.println("Enter Your Destination point :");
        this.to = sc.nextLine().toLowerCase();

        System.out.println("Enter Number of tickets required :");
        this.totalTickets = Integer.parseInt(sc.nextLine());

        Payment payment = new Payment();
        totalPrice = payment.getTotalPrice(from, to, totalTickets);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
