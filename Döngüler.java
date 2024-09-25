import java.util.Scanner;

public class Döngüler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int limit = scanner.nextInt();

        int toplam = 0;
        int sayiAdedi = 0;

        for (int i = 0; i <= limit; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayiAdedi++;
            }
        }

        if (sayiAdedi > 0) {
            double ortalama = (double) toplam / sayiAdedi;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }

        scanner.close();
    }
}

