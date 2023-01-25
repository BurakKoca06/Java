import java.util.Scanner;

public class EbobBulma {

    public static int ebob_bulma(int sayi1, int sayi2) {

        int ebob = 1;

        for(int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if((sayi1 % i == 0) && (sayi2 % i == 0)) {
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Say: ");
        int birinci_sayi = scanner.nextInt();

        System.out.print("İkinci Sayi: ");
        int ikinci_sayi = scanner.nextInt();

        System.out.print("İki Sayının Ebobu: " + ebob_bulma(birinci_sayi,ikinci_sayi));
    }
}
