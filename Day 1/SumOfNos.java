import java.util.Scanner;

public class SumOfNos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of a:" + a);
        int b = sc.nextInt();
        System.out.println("Enter the value of b:" + b);
        int c = a+b;
        System.out.println("Sum of a and b is:" + c);
        sc.close();
    }
}
