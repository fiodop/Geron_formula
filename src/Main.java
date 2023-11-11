import java.util.Scanner;
import java.math.*;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        geron(s1, s2, s3);
    }
    public static void geron(double x1, double x2, double x3){
        if (x1 > x2 + x3 || x2 > x1 + x3 || x3 > x1 + x2){
            System.out.println("Такого треугольника не существует");
        } else {
            double p = (x1 + x2 + x3)/2;
            double square = sqrt(p * (p - x1) * (p - x2) * (p - x3));
            System.out.println(square);
        }
    }
}