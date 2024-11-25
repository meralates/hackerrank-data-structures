import java.util.ArrayList;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//list uzunluğunu oku
        ArrayList<Integer> list = new ArrayList<>();
        //elemanları oku
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        //sorgu sayısı
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String operation = sc.next();//insert veya delete
            if (operation.equals("Insert")) {
                int index = sc.nextInt();
                int element = sc.nextInt();
                list.add(index, element);
            }else if (operation.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        sc.close();
        for(int num : list) {
            System.out.println(num + " ");
        }
    }
}
