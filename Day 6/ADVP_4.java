import java.util.Scanner;

public class ADVP_4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(65 + i));
            }
            System.out.println();
        }
        a.close();
    }
}
