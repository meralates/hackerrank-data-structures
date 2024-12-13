import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        //6 satırlık giriş aldık ve her satırı integera dönüştürdük
        IntStream.range(0,6).forEach(i-> {
            try{
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );
            }catch (IOException ex){
                throw new RuntimeException(ex);
            }
        });
        int maxSum=Integer.MIN_VALUE;
        //hourglassları bulmak için 4x4 alanda geziyoruz
        for (int i = 0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                //hourglass olusturup 7 hücreden toplamı alıyoruz
                int sum = arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)
                        +arr.get(i+1).get(j+1)
                        +arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                maxSum = Math.max(maxSum,sum);//en büyük toplamı buluyo
            }
        }
        System.out.println(maxSum);
    }
}