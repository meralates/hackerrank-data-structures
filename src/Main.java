import java.util.ArrayList;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();//array list

        int n = scanner.nextInt(); //satir sayisi
        for (int i = 0; i < n; i++) { //her satiri okur,arrayliste ekler
            int d= scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(scanner.nextInt());//alt liste
            }
            mainlist.add(row);
        }
        int q = scanner.nextInt(); //sorgu sayısını okur
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try{
                System.out.println(mainlist.get(x - 1).get(y - 1));// x satır-y eleman
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR !!!");
            }
        }
        scanner.close();
    }
}