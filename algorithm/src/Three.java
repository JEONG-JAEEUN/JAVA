import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String[] strings = new String[N];

        for (int i = 0; i < N; i++) {
            strings[i] = scanner.next();

        }

        for (int i = 0; i < N; i++) {
            System.out.println(strings[i]);
        }
    }
}
