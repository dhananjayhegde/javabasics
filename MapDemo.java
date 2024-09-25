import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> runners = new HashMap<String, String>();
        runners.put("Dhananjay", "50");
        runners.put("Amrutha", "50");
        runners.put("Kohli", "70");
        runners.put("Ronaldo", "80");

        System.out.println(runners.get(args[0]));
    }

}
