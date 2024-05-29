package bus_ticket_reservation_system;
import java.util.HashMap;

public class travelDetails {

    HashMap<String, Integer> map = new HashMap<>();

    public travelDetails(){
        map.put("chennai madurai", 850);
        map.put("madurai chennai", 850);
        map.put("chennai bangalore", 550);
        map.put("bangalore chennai", 850);
    }

    public HashMap<String, Integer> getDetails(){
        return map;
    }
}
