import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10828_Buffer {
    private int[] arr;
    //스택의 요소를 저장
    private int top;
    //스택의 맨 위
    private int capacity;
    // 스택의 총 용량

    public Bj10828_Buffer(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
        //첫번째 삽입 0 두번째 삽입 1
    }

    public void push(int element) {
        arr[++top] = element;
    }

    public int pop() {
        if (empty() == 1) { // empty return이 1 = 비어있다
            return -1; // 정수가 없는 경우 : -1
        }
        return arr[top--]; //맨 위 출력하고 top줄이기
    }

    public int empty() {
        if (top == -1) { //top 초기화가 -1
            return 1; //비어있다면 1
        } else {
            return 0; //비어있지 않다면 0
        }
    }

    public int size() {
        return top + 1; //배열은 0부터니까 +1해야 개수
    }

    public int top() {
        if (empty() == 0) { //empty가 0 = 비어있지 않다
            return arr[top]; // 맨 위 숫자 반환
        } else {
            return -1; //비어있는 경우 -1
        }
    }

    public static void main(String[] args) throws IOException { //예외 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()); //한 줄로 읽어서 String으로 변환한걸 int로
        Bj10828_Buffer stack = new Bj10828_Buffer(count);

        for (int i = 0; i < count; i++) {
            String line = br.readLine();
            String[] parts = line.split(" "); //공백을 기준으로 분할하여 문자열 배열 parts에 저장
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

        br.close();
    }
}
