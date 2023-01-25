import java.util.Scanner;

public class KmHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Gidilen mesafe km:");
        double mesafe = scanner.nextDouble();

        System.out.print("Km başına harcanan tutar:");
        double tutar = scanner.nextDouble();

        double ucret = mesafe * tutar;
        System.out.println("Ücret: " + ucret);
    }
}
