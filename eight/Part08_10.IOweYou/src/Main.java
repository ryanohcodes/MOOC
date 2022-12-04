
public class Main {

    public static void main(String[] args) {
        // Test your program here
        IOU mattsIOU = new IOU();
        
        mattsIOU.setSum("Authur", 51.5);
        mattsIOU.setSum("Micheal", 30);
        
        System.out.println(mattsIOU.howMuchDoIOweTo("Authur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Micheal"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Micheal2"));
        System.out.println(mattsIOU);
    }
}