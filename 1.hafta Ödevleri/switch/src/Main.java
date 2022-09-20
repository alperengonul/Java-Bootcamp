public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("mükemmel : geçtiniz");
                break;
            case 'F':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("geçersiz not girildi");
        }

    }
}