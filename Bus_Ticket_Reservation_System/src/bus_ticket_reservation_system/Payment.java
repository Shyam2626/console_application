package bus_ticket_reservation_system;

import java.util.HashMap;

public class Payment {

    travelDetails obj = new travelDetails();

    HashMap<String, Integer> map = obj.getDetails();

    public int getTotalPrice(String from, String to, int totalTickets) {
        int totPrice = 0;

        String key = from + " " + to;

        if (map.get(key) == null) {
            return -1;
        }

        totPrice = totalTickets * map.get(key);
        return totPrice;
    }

}
