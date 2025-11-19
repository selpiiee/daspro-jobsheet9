
import java.util.Scanner;

public class arrayNumber21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[4];
        num[0] = 5;
        num[1] = 12;
        num[2] = 7;
        num[3] = 20;

        for (int i = 0; i <= 4; i++) {
            System.out.println(num[i]);
        }

        sc.close();
    }
}
