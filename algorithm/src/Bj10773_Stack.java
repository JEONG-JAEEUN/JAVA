import java.util.Stack; //import
import java.util.Scanner;

public class Bj10773_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //int형 스택 선언

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum=0;

        for (int i = 0; i < count; i++) {
            int input = scanner.nextInt();

            if (input == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(input);
            }   // stack에 값 input 추가
        }
        while (!stack.isEmpty()) {
            sum += stack.peek();
            stack.pop();
        }
        System.out.println(sum);
    }
}