import java.util.*;
//https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true
class Printer{
    public static<T>void printArray(T[]array){
        for(T element : array){
            System.out.println(element);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //array boyutu al
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt(); //elemanlari al
        }
        //String array icin input-print
        int m = scanner.nextInt();
        String[] stringArray = new String[m];
        for (int i = 0; i < m; i++) {
            stringArray[i] = scanner.next();
        }
        Printer.printArray(intArray);
        Printer.printArray(stringArray);
         if (Printer.class.getDeclaredMethods().length>1){
             System.out.println("The printer class should only have one method named printArray");
         }
    }
}