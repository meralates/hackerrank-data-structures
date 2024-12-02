import java.util.*;
//https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//dizi b.
        int k = sc.nextInt();//pencere b.

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {//arrayi okur
            arr[i] = sc.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();//pencere
        HashSet<Integer> set  = new HashSet<>();//unique eleman takbi
        int maxUnique=0;

        for (int i = 0; i < n; i++) {
            int current=arr[i];
            deque.add(current);//elemanı ekle
            set.add(current);//hashsete ekle

            if (deque.size()>k) {//boyutu aştıysa
                int removed=deque.poll();//ilk elemanı çıkart
                if (!deque.contains(removed)) {
                    set.remove(removed);//hashsetten çıkart
                }
            }
            maxUnique=Math.max(maxUnique,set.size());
        }
        System.out.println(maxUnique);
    }
}