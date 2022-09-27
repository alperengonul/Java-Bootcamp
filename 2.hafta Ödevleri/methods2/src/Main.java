public class Main {
    public static void main(String[] args) {

        String mesaj = "bugün hava güzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);

        int yeniMesaj2 =  topla(1,9);
        System.out.println(yeniMesaj2);

        int toplam = topla2(2,3,4);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
    for (int sayi : sayilar){
        toplam+=sayi;
    } return toplam;
    }
    public static int topla(int a, int b){

        return a+b;
    }

}