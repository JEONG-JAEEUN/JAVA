import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();

        boolean result = true;
        for (int i = 0; i < S.length();) {
            char a = S.charAt(i);
            if (a == 'p' && i + 1 < S.length() && S.charAt(i + 1) == 'i') {
                i+=2; // pi가 맞다면 p의 2문자 뒤인 i 뒤의 문자로
            } else if (a == 'k' && i + 1 < S.length() && S.charAt(i + 1) == 'a') {
                i+=2;
            } else if (a == 'c' && i + 2 < S.length() && S.charAt(i + 1) == 'h' && S.charAt(i + 2) == 'u') {
                i +=3; //chu가 맞다면 c의 3문자 뒤인 u 뒤의 문자로
            } else {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
