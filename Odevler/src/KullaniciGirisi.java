import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanici_adi = "Burak";
        String sys_parola = "12345";

        System.out.println("********************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("********************");

        while (true) {
            System.out.print("Kullanıcı Adı:");
            String kullanici = scanner.nextLine();
            System.out.print("Parola:");
            String parola = scanner.nextLine();

            if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz:" + kullanici);
                break;
            }
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("Parola Yanlış...");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı: " + giris_hakki);
            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Kullanıcı Adınız Yanlış...");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı: " + giris_hakki);
            }
            else {
                System.out.println("Kullanıcı Adı ve Parola Yanlış...");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı: " + giris_hakki);
            }
            if(giris_hakki == 0){
            System.out.println("Giriş Hakkınız Bitti. Tekrar Bekleriz...");
            break;
        }
        }
    }
}
