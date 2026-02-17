import java.util.Scanner;
public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İkinci dereceden denklemin katsayılarını girin: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Tüm reel sayılar denklemi sağlar (Sonsuz çözüm).");
                } else {
                    System.out.println("Çözüm kümesi boş (Çözüm yok).");
                }
            } else {
                double x = -c / b;
                System.out.printf("a=0 olduğu için birinci dereceden tek kök var: x = %.2f%n", x);
            }

            input.close();
            return;
        }

        double delta = (b*b) - (4*a*c);
        System.out.println("Delta: " + delta);

        double x1 = ((b*-1) + Math.sqrt(delta)) / (2*a);
        double x2 = ((b*-1) - Math.sqrt(delta)) / (2*a);

        if (delta > 0) {
            System.out.println("İki reel kök var:");
            System.out.printf("x1: %.2f\n",x1);
            System.out.printf("x2: %.2f\n",x2);

        } else if (delta == 0) {
            System.out.println("Çift katlı kök var: ");
            System.out.printf("x1: %.2f%n",x1);

        } else {
            double realPart = (-1*b) / (2*a);
            double imaginary = Math.sqrt(-delta) / (2*a);
            System.out.println("Denklemin kökleri karmaşıktır: ");
            System.out.printf("Kök 1 (karmaşık): %.2f + %.2fi%n", realPart, imaginary);
            System.out.printf("Kök 2 (karmaşık): %.2f - %.2fi%n", realPart, imaginary);
        }

        input.close();
    }
}
