public class Main {
    public static void main(String[] args) {
        String[][] sehirler=new String[3][3];

        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="Bilecik";
        sehirler[1][0]="Ankara";
        sehirler[1][1]="Konya";
        sehirler[1][2]="Kayseri";
        sehirler[2][0]="Diyarbakır";
        sehirler[2][1]="Şanlıurfa";
        sehirler[2][2]="Gaziantep";

        for(int ii=0;ii<=2;ii++) {    //SATIR
            System.out.println("--------------------------");
            for (int jj=0;jj<=2;jj++) {  //SÜTUN
                System.out.println(sehirler[ii][jj]);
            }
        }
    }
}