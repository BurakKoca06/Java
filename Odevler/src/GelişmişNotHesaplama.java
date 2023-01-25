import java.util.Scanner;

public class GelişmişNotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize1: ");
        int vize1 = scanner.nextInt();
        System.out.print("Vize2 :");
        int vize2 = scanner.nextInt();
        System.out.print("Final: ");
        int final_notu = scanner.nextInt();

        double toplam = (vize1 * 0.3) + (vize2 * 0.3) + (final_notu * 0.4);

        System.out.print("Okul Ortalamanız:");
        double ortalama = scanner.nextDouble();

        if(toplam >= 90) {
            System.out.println("Harf Notunuz: AA");
        }
        else if (toplam >= 85) {
            System.out.println("Harf Notunuz: BA");
        }
        else if (toplam >= 80) {
            System.out.println("Harf Notunuz: BB");
        }
        else if (toplam >= 75) {
            System.out.println("Harf Notunuz: CB");
        }
        else if (toplam >= 70) {
            System.out.println("Harf Notunuz: CC");
        }
        else if (toplam >= 65) {
            System.out.println("Harf Notunuz: DC");
        }
        else if (toplam >= 60) {
            System.out.println("Harf Notunuz: DD");
            if(ortalama < 2.50) {
                System.out.println("DD aldınız ve not ortalamanız düşük. Bu dersi tekrardan almayı düşünebilirsiniz.");
        }
        else if (toplam >= 55) {
            System.out.println("Harf Notunuz: FD");
            }
        }
        else if (toplam >= 50) {
            System.out.println("Harf Notunuz: FF");
        }
        else {
            System.out.println("Kaldınız..!");
        }
    }
}
