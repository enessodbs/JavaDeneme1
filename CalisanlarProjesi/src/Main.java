
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalýþanlar Programýna Hoþgeldiniz...");
        String islemler = "Ýþlemler...\n"
                + "1. Yazýlýmcý Ýþlemler\n"
                + "2. Yönetici Ýþlemleri\n"
                + "3. Çýkýþ için q";

        System.out.println("********************************************");
        System.out.println(islemler);
        System.out.println("********************************************");

        while (true) {
            System.out.println("Ýþlemi Seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Çýkýlýyor...");
                break;
            } else if (islem.equals("1")) {

                Yazilimci yazilimci = new Yazilimci("Enes", "Odabaþ", 1907, "Java,C#,Flutter");
                String yazilimci_islem = "1. Format at\n"
                        + "2. Bilgileri Göster\n"
                        + "Çýkýþ için q";

                System.out.println(yazilimci_islem);
                while (true) {
                    System.out.println("Ýþlemi Seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Sistemden Çýkýlýyor...");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Format atmak istediðiniz iþletim sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz Parametre.");
                    }
                }
            } else if (islem.equals("2")) {

                Yonetici yonetici = new Yonetici("Erdoðan", "Odabaþ", 0001, 10);
                String yonetici_islemleri = "1. Zam Yap\n"
                        + "2. Bilgileri Göster\n"
                        + "Çýkýþ için q";
                System.out.println(yonetici_islemleri);

                while (true) {
                    System.out.println("Ýþlemi Seçiniz: ");
                    String yonetici_islem = scanner.nextLine();

                    if (yonetici_islem.equals("1")) {
                        System.out.println("Yapýlacak Zam Miktarý: ");
                        int zam_miktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktari);
                    } else if (yonetici_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    } else if (yonetici_islem.equals("q")) {
                        System.out.println("Sistemden Çýkýlýyor...");
                        break;
                    } else {
                        System.out.println("Geçersiz Parametre.");
                    }
                }
            } else {
                System.out.println("Geçersiz Parametre.");
            }

        }
    }

}
