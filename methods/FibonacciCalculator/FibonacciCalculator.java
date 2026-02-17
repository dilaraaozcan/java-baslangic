import java.util.Scanner;

public class FibonacciCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci için n değerini giriniz: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Hata: n değeri negatif olamaz.");
            return;
        }

        int sonuc = fibonacci(n);
        System.out.println(n + ". Fibonacci sayısı: " + sonuc);

        input.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
