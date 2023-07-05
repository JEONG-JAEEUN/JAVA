import java.util.ArrayList;
import java.util.Scanner;

public class Bj5397_2keylogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        ArrayList<String[]> arrays = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String input = scanner.next();

            StringBuilder result = new StringBuilder();
            //string을 합치는 작업의 대안
            int cursor = 0; // 커서 위치

            for (int j = 0; j < input.length(); j++) { // 몇번 입력받을 지
                char c = input.charAt(j);

                if (c == '<') {
                    if (cursor > 0) {
                        cursor--; // 커서를 앞으로 이동
                    }
                } else if (c == '>') {
                    if (cursor < result.length()) {
                        cursor++; // 커서를 뒤로 이동
                    }
                } else if (c == '-') {
                        if (cursor > 0) {
                            result.deleteCharAt(cursor - 1); // 커서 앞의 문자 삭제
                            cursor--; // 커서를 앞으로 이동
                        }
                } else {
                    result.insert(cursor, c); // 문자를 커서 위치에 삽입
                    cursor++; // 커서를 다음 위치로 이동
                }
            }

            String[] charArray = new String[result.length()];
            for (int r = 0; r < result.length(); r++) {
                charArray[r] = String.valueOf(result.charAt(r)); //char을 문자열로 변경
            }
            arrays.add(charArray);
        }

        for (String[] array : arrays) {
            for (String element : array) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
