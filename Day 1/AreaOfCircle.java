import java.util.*;
public class AreaOfCircle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("Enter the value of r:" + r);
        double area = 3.14 * r * r;
        System.out.println("Area of circle is:" + area);
        sc.close();
    }
}