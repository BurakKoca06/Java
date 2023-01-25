import java.util.Scanner;

public class HesapMakinesi2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************");
        String islemler = "1- Toplama\n2- Çıkartma\n3- Çarpma\n4- Bölme";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.print("İşlemi Seçiniz:");
        String islem = scanner.nextLine();
        int a;
        int b;
        switch (islem) {
            case "1":
                System.out.print("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Toplamları : " + (a+b));
                break;
            case "2":
                System.out.print("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Farkları : "+ (a-b));
                break;
            case "3":
                System.out.print("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Çarpımı : " + (a*b));
                break;
            case "4":
                System.out.print("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Bölümü : " + (double) a/b);
                break;
            default:
                System.out.println("Geçersiz İşlem.....!");
        }
    }
}
