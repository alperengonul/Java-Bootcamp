import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random r=new Random();
        int number =  r.nextInt(100);


        System.out.println("belirlenen sayı : " + number);
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz sayı");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }

        if (isPrime) {
            System.out.println("Sayı Asaldır");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }
}