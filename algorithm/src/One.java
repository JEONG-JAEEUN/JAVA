import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i = a.nextInt();
        for(int j=1;j<=9;j++){
            System.out.println(i +" * "+j+" = "+i*j);
        }
    }
}