public class Main {
    public static void main(String[] args) {
        char harf = 'E';
        char[] kalınSesliHarfler = {'A', 'I', 'O', 'U'};
        char[] inceSesliHarfler = {'E', 'İ', 'Ö', 'Ü'};
        boolean sesliMi = true;

        for (char kalınSes : kalınSesliHarfler) {
            if (harf == kalınSes) {
                sesliMi = true;
                break;
            }
        }

        for (char inceSes : inceSesliHarfler) {
            if (harf == inceSes) {
                sesliMi = true;
                break;
            }
        }

        if (sesliMi) {
            System.out.println(harf + " kalın sesli harftir.");
        } else {
            System.out.println(harf + " ince sesli harftir.");
        }
    }
}