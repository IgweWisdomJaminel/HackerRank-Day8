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
        int n= sc.nextInt();
        sc.nextLine();


       while(n>phonebook.size()) {
           phonebook.put(sc.next(), sc.nextInt());
       }




        for(int i=0; i<phonebook.size(); i++){
            String value=sc.next();
            if(value.isEmpty()){
                break;
            }
            System.out.println(value+"="+phonebook.get(value));

            if(phonebook.get(value)==null){
                System.out.println("Not found");
            }
        }


    }
}
