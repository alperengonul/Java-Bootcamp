public class Main {
    public static void main(String[] args) {
        String ogrenci="engin";
        String ogrenci2="derin";
        String ogrenci3="salih";

        System.out.println(ogrenci+" "+ogrenci2+" "+ogrenci3);

        System.out.println("-----------------------------");
        String [] ogrenciler = new String[3];
        ogrenciler[0]="alperen";
        ogrenciler[1]="kamil";
        ogrenciler[2]="aasda";
        for (int l=0;l<ogrenciler.length;l++){
            System.out.println(ogrenciler[l]);
        }

        for (String ogrencii:ogrenciler){
            System.out.println(ogrencii);
        }
    }
}