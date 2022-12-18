public class Main {
    public static void main(String[] args) {
        // make test programs here
        SimpleDate d = new SimpleDate(1,2,2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(2,4,202)));
        System.out.println(d.equals(new SimpleDate(1,2,2000)));
    }
}
