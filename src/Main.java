import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        Set<String>uniquePairs=new HashSet<>();//farklı ciftler icin hashset

        for (int i = 0; i < t; i++) {
            String pair = s.nextLine();
            uniquePairs.add(pair); //sete ekle
            System.out.println(uniquePairs.size());// kac tane old. yazdır
        }
        s.close();
    }
}