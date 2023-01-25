import java.util.Scanner;

public class FaizUygulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz. Faiz Oranı %6");

        int anapara,vade;
        System.out.print("Yatırmak istediğiniz tutar: ");
        anapara = scanner.nextInt();
        System.out.println("Paranızı kaç yıl vadeli yatırmak istiyorsunuz: ");
        vade = scanner.nextInt();

        double toplam_para = anapara;

        double faiz_orani = 0.06;

        for(int i = 1; i <= vade; i++) {

            toplam_para = (toplam_para * faiz_orani) + toplam_para;

            System.out.println(i + ".yılın sonunda toplam para: " + (int) toplam_para);

        }
    }
}
