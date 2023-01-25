import java.util.Scanner;

public class ArmstrongSayisiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz:");
        int sayi = scanner.nextInt();
        System.out.print("Basamak Sayısı:");
        int basamak_sayisi = scanner.nextInt();

        int gecici_sayi = sayi;
        int toplam = 0;

        do {
            int basamak_değeri = gecici_sayi % 10;
            gecici_sayi = gecici_sayi / 10;

            toplam += Math.pow(basamak_değeri,basamak_sayisi);

        }
        while (gecici_sayi > 0);

        if(sayi == toplam) {
            System.out.println("Bu sayı bir Armstrong Sayısıdır.");
        }
        else {
            System.out.println("Bu sayı bir Armstrong Sayısı Değildir.");
        }
    }
}
