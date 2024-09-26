package Week2;
import java.util.Scanner;

// a + b = 8
// a + c = 13
// c - d = 6
// b + d = 8

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a + b? ");
        double num1 = scanner.nextDouble();
        System.out.print("a + c? ");
        double num2 = scanner.nextDouble();
        System.out.print("c - d? ");
        double num3 = scanner.nextDouble();
        System.out.print("b + d? ");
        double num4 = scanner.nextDouble();

        double total = (num1 + num2 + num3 + num4) / 2;
        double caseC = total - num1;
        double caseA = num2 - caseC;
        double caseB = num1 - caseA;
        double caseD = num4 - caseB;

        System.out.printf("a + b: %.1f %n", caseA);
        System.out.printf("a + c: %.1f %n", caseB);
        System.out.printf("c - d: %.1f %n", caseC);
        System.out.printf("b + d: %.1f %n", caseD);

    }

}
