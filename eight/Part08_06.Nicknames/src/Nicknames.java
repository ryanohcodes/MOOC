
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> myFirstHashMap = new HashMap<>();
        myFirstHashMap.put("matthew","matt");
        myFirstHashMap.put("michael","mix");
        myFirstHashMap.put("authur","artie");
        System.out.println(myFirstHashMap.get("matthew"));
        System.out.println(myFirstHashMap.get("michael"));
        System.out.println(myFirstHashMap.get("authur"));
    }

}