import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8Copy {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> phonenumber= new HashMap<>();
        int n =0;
        sc.nextLine();

        for(int i=0; i<n; i++){
            String input = sc.nextLine();
            String[]split=input.split(" ");
            String name= split[0];
            int number= Integer.parseInt(split[1]);
            phonenumber.put(name,number);



        }
    }
}
