import java.util.ArrayList;
import java.util.HashSet;

public class guestlistmanager {
    public static void main(String[] args) {
        ArrayList<String> guestList = new ArrayList<>();
        guestList.add("Ash");
        guestList.add("prathana");
        guestList.add("siva");
        guestList.add("Ash"); 
        guestList.add("Selva");
        System.out.println("Guest list (ArrayList): " + guestList);
        HashSet<String> uniqueGuests = new HashSet<>(guestList);
        System.out.println("Unique guests (HashSet): " + uniqueGuests);
        System.out.println("Total guests in ArrayList: " + guestList.size());
        System.out.println("Total unique guests in HashSet: " + uniqueGuests.size());
        String searchName = "prathana";
        if (uniqueGuests.contains(searchName)) {
            System.out.println(searchName + " is in the guest list.");
        } else {
            System.out.println(searchName + " is not in the guest list.");
        }
    }
}
