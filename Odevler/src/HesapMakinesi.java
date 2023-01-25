import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int islem;
        System.out.println("İşleminizi Seçin: 1-Toplama    2-Çıkartma     3-Çarpma    4-Bölme");

        islem = scanner.nextInt();

        if (islem == 1) {
            System.out.println("Sayılarınızı Giriniz");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("1. Sayı:" + sayi1 + "   2. Sayı:" + sayi2);
            int toplam = sayi1 + sayi2;
            System.out.print("Sayıların Toplamı:" + toplam);
        }
        else if (islem == 2) {
            System.out.println("Sayılarınızı Giriniz");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("1. Sayı:" + sayi1 + "   2. Sayı:" + sayi2);
            int fark = sayi1 - sayi2;
            System.out.println("Sayıların Farkı:" + fark);
        }
        else if (islem == 3) {
            System.out.println("Sayılarınızı Giriniz");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("1. Sayı:" + sayi1 + "   2. Sayı:" + sayi2);
            int carpım = sayi1 * sayi2;
            System.out.println("Sayıların Çarpımı:" + carpım);
        }
        else if (islem == 4) {
            System.out.println("Sayıları Giriniz:");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("1. Sayı:" + sayi1 + "   2. Sayı:" + sayi2);
            int bolum = sayi1 / sayi2;
            System.out.println("Sayıların Bölümü:" + bolum);
        }
        else {
            System.out.println("Geçersiz İşlem..!");
        }
    }
}
