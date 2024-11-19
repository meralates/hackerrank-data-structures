import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //dizinin uzunlugu al
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {//kullanicidan diziyi al
            arr[i] = sc.nextInt();
        }
        int negativeSubarraysCount = 0;

        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = i; j < n; j++) { //tum alt diziler hessaplanir
                sum += arr[j];

                if (sum < 0) {
                    negativeSubarraysCount++;
                }
            }
        }
        System.out.println(negativeSubarraysCount);//negatif alt dizilerin sayisi
    }
}