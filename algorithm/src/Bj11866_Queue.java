import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11866_Queue {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] parts = input.split(" ");//공백을 기준으로 분할하여 문자열 배열 parts에 저장
        int one = Integer.parseInt(parts[0]); //배열의 0번째, 몇개의 숫자 입력
        int two = Integer.parseInt(parts[1]); //배열의 1번째, 몇 번째 숫자 출력

        for (int i = 1; i <= one; i++) {
            queue.offer(i); //offer: Queue에 객체를 저장
        }
        //StringBuilder의 객체를 생성한 후,
        //append()의 인자로 연결하고자 하는 문자열을 넣어서 StringBuilder의 객체를 통해 호출
        StringBuilder result = new StringBuilder("<");

        int count = 1;
        while (!queue.isEmpty()) { // 비어있지 않는 동안 반복
            int number = queue.poll(); // 객체를 꺼내서 반환

            if (count < two) {
                queue.offer(number); //poll로 꺼낸 number을 다시 queue에 저장
                count++;
            } else if (count == two) { //count가 two번째 숫자라면
                result.append(number);
                count = 1; // 다시 1로 초기화

                if (!queue.isEmpty()) { //queue가 비어있지 않을 때만 실행
                    result.append(", "); // 마지막 요소 뒤에는 , 가 붙으면 안되니까
                }
            }
        }
        result.append(">");
        System.out.println(result.toString());
    }
}
