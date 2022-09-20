public class Main {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=25;
        int sayi3=2;
        int enbuyuksayi = sayi1;



        if (enbuyuksayi < sayi2) {
            enbuyuksayi = sayi2;
        }
        else if (enbuyuksayi < sayi3) {
            enbuyuksayi = sayi3;
        }
        System.out.println("En Büyük sayi = " + enbuyuksayi);
    }
}