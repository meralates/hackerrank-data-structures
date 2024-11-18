import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); //satir sonunu atlar

        Map<String,String> phoneBook = new HashMap<>();//phone book

        //giris ekle
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            String phone = in.nextLine();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s +" " + phoneBook.get(s));
            }else{
                System.out.println("not found");
            }
        }
        in.close();
    }
}
