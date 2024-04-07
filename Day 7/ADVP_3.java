import java.util.*;
public class p_lec_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1; j<= n - i - 1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i+1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
