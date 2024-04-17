import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,Integer> phonebook= new HashMap<>();
        phonebook.put(sc.next(),sc.nextInt());
        phonebook.put(sc.next(),sc.nextInt());
        phonebook.put(sc.next(),sc.nextInt());

    }
}
