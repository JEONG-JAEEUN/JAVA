import java.util.ArrayList;
import java.util.Scanner;

public class Bj5397_1keylogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        ArrayList<String[]> arrays = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String input = scanner.next();

            while (input.contains("-")) {
                int index = input.indexOf("-");
                input = erase(input, index);
            }
            while (input.contains("<")) {
                int index = input.indexOf("<");
                input = insert(input, index);
            }

            String[] charArray = new String[input.length()];
            for (int j = 0; j < input.length(); j++) {
                charArray[j] = String.valueOf(input.charAt(j));
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

    private static String erase(String input, int index) {
        if (index > 0) {
            input = input.substring(0, index - 1) + input.substring(index + 1);
        } else {
            input = input.substring(index + 1);
        }
        return input;
    }
    private static String insert(String input, int index) {
        if (index > 0) {
            input = input.substring(0, index - 1) + input.substring(index + 1) + input.substring(index - 1, index);
        } else {
            input = input.substring(index + 1);
        }
        return input;
    }
}