import java.util.*;
public class p_lec_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=i;j<=2*i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
        sc.close(); // Close the Scanner object
    }
}
