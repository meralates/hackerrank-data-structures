import java.util.Scanner;
import java.util.Stack;
//https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
//last in first outu kullanır
public class Main {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>(); // Stack olusur

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {//boşsa eşleşme olmaz
                    return false;
                }
                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();//stack bos olmali
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(isBalanced(input));
        }
        scanner.close();
    }
}




