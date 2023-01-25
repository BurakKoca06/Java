public class AsalBulma {
    public static boolean asal_mi(int sayi) {
        for(int i = 2; i < sayi; i++) {
            if(sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        for(int i = 2; i < 1000; i ++) {
            if(asal_mi(i)){
                System.out.println(i);
            }
        }

    }
}
