// Herhangi bir harf ile çıkış yapamadım. Araştır!!!

import java.util.Scanner;

public class ATMProgramı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("*******************************");
        String islemler = "1.Bakiye Öğrenme\n2.Para Çekme\n3.Para Yatırma\nÇıkış İçin 'q' ya basınız";
        System.out.println(islemler);
        System.out.println("*******************************");

        int miktar;
        int kalan;

        while(true){
            System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
            int islem = scanner.nextInt();

            if(islem == 1){
                System.out.println("Bakiyeniz: " + bakiye);
            }

            else if (islem == 2) {
                System.out.print("Çekmek İstediğiniz Tutar: ");
                miktar = scanner.nextInt();
                if(miktar > bakiye) {
                    System.out.println("Daha Düşük Miktar Giriniz...");
                    continue;
                }
                kalan = bakiye - miktar;
                bakiye = kalan;
                System.out.println("Çekilen Miktar: " + miktar + "TL");
                System.out.println("Yeni Bakiye: " + kalan + "TL");

            }

            else if (islem == 3) {
                System.out.print("Yatırmak İstediğiniz Tutar: ");
                miktar = scanner.nextInt();
                kalan = bakiye + miktar;
                bakiye = kalan;
                System.out.println("Yatırılan miktar: " + miktar + "TL");
                System.out.println("Yeni Bakiye: " + kalan + "TL");
            }

            else if (islem == 0) {
                System.out.println("ATM'DEN ÇIKIŞ YAPILDI...");
                break;
            }

            else {
                System.out.println("Geçersiz İşlem. Lütfen Tekrar Deneyiniz...");
            }
        }
    }
}