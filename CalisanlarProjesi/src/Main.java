
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("�al��anlar Program�na Ho�geldiniz...");
        String islemler = "��lemler...\n"
                + "1. Yaz�l�mc� ��lemler\n"
                + "2. Y�netici ��lemleri\n"
                + "3. ��k�� i�in q";

        System.out.println("********************************************");
        System.out.println(islemler);
        System.out.println("********************************************");

        while (true) {
            System.out.println("��lemi Se�iniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan ��k�l�yor...");
                break;
            } else if (islem.equals("1")) {

                Yazilimci yazilimci = new Yazilimci("Enes", "Odaba�", 1907, "Java,C#,Flutter");
                String yazilimci_islem = "1. Format at\n"
                        + "2. Bilgileri G�ster\n"
                        + "��k�� i�in q";

                System.out.println(yazilimci_islem);
                while (true) {
                    System.out.println("��lemi Se�iniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Sistemden ��k�l�yor...");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Format atmak istedi�iniz i�letim sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Ge�ersiz Parametre.");
                    }
                }
            } else if (islem.equals("2")) {

                Yonetici yonetici = new Yonetici("Erdo�an", "Odaba�", 0001, 10);
                String yonetici_islemleri = "1. Zam Yap\n"
                        + "2. Bilgileri G�ster\n"
                        + "��k�� i�in q";
                System.out.println(yonetici_islemleri);

                while (true) {
                    System.out.println("��lemi Se�iniz: ");
                    String yonetici_islem = scanner.nextLine();

                    if (yonetici_islem.equals("1")) {
                        System.out.println("Yap�lacak Zam Miktar�: ");
                        int zam_miktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktari);
                    } else if (yonetici_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    } else if (yonetici_islem.equals("q")) {
                        System.out.println("Sistemden ��k�l�yor...");
                        break;
                    } else {
                        System.out.println("Ge�ersiz Parametre.");
                    }
                }
            } else {
                System.out.println("Ge�ersiz Parametre.");
            }

        }
    }

}
