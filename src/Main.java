import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();//elemanları diziye alır
        }
        scan.close();
        //elemanları yazdır
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}