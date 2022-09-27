public class Main {
    public static void main(String[] args) {

        sayiBulmaca(5);
    }

    public static void sayiBulmaca(int aranan) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5};
        int aranacak = aranan;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer("Sayi mevcuttur :" + aranacak);
        } else {
            mesajVer("Sayi mevcut değildir :" + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);

    }
}