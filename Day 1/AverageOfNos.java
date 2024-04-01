import java.util.*;

public class AverageOfNos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println("Enter 1st number : " + A);
        int B = sc.nextInt();
        System.out.println("Enter 2nd number : " + B);
        int C = sc.nextInt();
        System.out.println("Enter 3rd number : " + C);
        int average = (A + B + C) / 3;
        System.out.println("average is : " + average);
    }
}