
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String,Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
    public static void printValues(HashMap<String,Book> hashmap){
        for(Book values : hashmap.values()){
            System.out.println(values.toString());
        }
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(String name : hashmap.keySet()){
            if(hashmap.get(name).getName().contains(text)){
                System.out.println(hashmap.get(name).toString());
            }
        }
    }
}
