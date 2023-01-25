import java.util.Scanner;

public class KosulluBedenKitle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Giriniz:");
        double boy = scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz:");
        int kilo = scanner.nextInt();

        double bki = (kilo / (boy*boy));
        if(bki <18.5) {
            System.out.println("Zayıf");
        }
        else if (bki >= 18.5 && bki < 25) {
            System.out.println("Normal");
        }
        else if (bki>=25 && bki< 30) {
            System.out.println("Fazla Kilolu");
        }
        else {
            System.out.println("Obez");
        }
    }
}
