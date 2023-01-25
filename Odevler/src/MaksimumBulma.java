import java.util.Scanner;

public class MaksimumBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Sayıları Giriniz:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maks = -1;

        System.out.println("a:" + a + " b:" + b + " c:" + c);

        if(a>=b && a>=c) {
            maks = a;
        }
        else if (b>=a && b>=c) {
            maks = b;
        }
        else {
            maks = c;
        }

        System.out.print("Maksimum Sayı:" + maks);
    }
}
