import java.util.Scanner;
//buffer쓰기 전 시간초과
public class Bj10828_Scanner {

    // 스택의 요소를 저장할 int[]
    private int[] arr;
    // 스택의 맨 위
    private int top;
    // 스택의 총 용량
    private int capacity;

    Bj10828_Scanner(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // 요소를 스택의 맨 위에 추가
    public void push(int element) {
        arr[++top] = element;
    }

    // 스택 안의 맨 마지막 값을 제거하는 메서드
    public int pop() {
        if (empty()==1) {
            return -1;
            /*System.exit(1);*/
        }
        return arr[top--];
    }

    public int empty() {
        if (top == -1) {
            return 1;
        } else {
            return 0;
        }
    }

    // 스택의 크기를 구하는 메서드
    public int size() {
        return top + 1;
    }

    // 마지막 요소를 확인하는 메서드
    public int top() {
        if (empty()==0)
            return arr[top];
        else
            return -1;
    }

    // 스택 안의 요소들을 출력하는 메서드


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Bj10828_Scanner stack = new Bj10828_Scanner(count);
        scanner.nextLine(); // 개행 문자(\n) 처리

        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            String command = parts[0];

            if (command.equals("push")) {
                int element = Integer.parseInt(parts[1]);
                stack.push(element);
            } else if (command.equals("pop")) {
                int popped = stack.pop();
                System.out.println(popped);
            } else if (command.equals("size")) {
                int size = stack.size();
                System.out.println(size);
            } else if (command.equals("empty")) {
                int empty = stack.empty();
                System.out.println(empty);
            } else if (command.equals("top")) {
                int top = stack.top();
                System.out.println(top);
            }
        }
    }


}
