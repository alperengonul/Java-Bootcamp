public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel";
        System.out.println(mesaj);


        System.out.println("Eleman sayısı : " + mesaj.length()); //String içindeki karakter sayısını söyler.
        System.out.println("5. Eleman : " + mesaj.charAt(2)); //Stringteki istenilen indexteki elemanı getirir.
        System.out.println(mesaj.concat(" YAŞASIN !")); //String değere birleştirme yapar.
        System.out.println(mesaj.startsWith("B")); // B ile başlıyorsa true döndürür.
        System.out.println(mesaj.endsWith(".")); // . ile bitiyor mu?

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);  //0'dan 5'e kadar olan indexteki karakterleri getirir.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); //av'nın kaçıncı indexte olduğunu söyler. ilk bulduğunu verir.
        System.out.println(mesaj.lastIndexOf("a")); //sondan başlayarak a'yi arar.

        System.out.println(mesaj.replace(' ', '-')); //Bir metnin içerisindeki boşluklara "-" ekleyerek yeni bir çıktı üretir.
        System.out.println(mesaj.substring(2, 5)); //Bir metnin içerisinden index numarasına göre karakterleri alır.


        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());  // Tüm metni küçük harflerle yazar.

        System.out.println(mesaj.toUpperCase()); // Tüm metni büyük harflerle yazar.
        System.out.println(mesaj.trim()); //başındaki ve sonundaki boşlukları atar.
    }
}