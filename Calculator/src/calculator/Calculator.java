package calculator;

import java.util.Scanner;

public class Calculator {

    // 2 Method
    public static int cikarma(int a, int b) {

        return (a - b);

    }

    public static double bolme(int a, int b) {

        return ((double) a / b);
    }

    public static int carpma(int a, int b) {

        return (a * b);
    }

    public static int toplama(int a, int b) {

        return (a + b);
    }

    // 3 Method
    public static int cikarma(int a, int b, int c) {

        return (a - b - c);

    }

    public static double bolme(int a, int b, int c) {

        return ((double) a / b / c);
    }

    public static int carpma(int a, int b, int c) {

        return (a * b * c);
    }

    public static int toplama(int a, int b, int c) {

        return (a + b + c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. Toplama islemi"
                + "2. Cikarma islemi"
                + "3. Carpma islemi"
                + "4. Bolme islemi"
                + "Cikis icin q'ya basiniz";

        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");

        int a;
        int b;
        int c;

        while (true) {
            System.out.println("islem Seciniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {

                System.out.println("Programdan Cikiliyor...");
                break;
            } else if (islem.equals("1")) {

                System.out.println("Kac deger toplayacaksiniz? (2 veya 3))");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {

                    System.out.println("Sayı 1: ");
                    a = scanner.nextInt();
                    System.out.println("Sayı 2: ");
                    b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Toplam: " + toplama(a, b));

                } else if (kacsayi == 3) {
                    System.out.println("Sayi 1: ");
                    a = scanner.nextInt();
                    System.out.println("Sayi 2: ");
                    b = scanner.nextInt();
                    System.out.println("Sayi 3: ");
                    c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Toplam: " + toplama(a, b, c));
                } else {
                    System.out.println("Bunun icin uygun parametre bulunmuyor...");
                }

            } else if (islem.equals("2")) {
                System.out.println("Kac deger cikaracaksiniz? (2 veya 3)");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.println("Sayi 1: ");
                    a = scanner.nextInt();
                    System.out.println("Sayi 2: ");
                    b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sonuc : " + cikarma(a, b));
                } else if (kacsayi == 3) {
                    System.out.println("Sayi 1: ");
                    a = scanner.nextInt();
                    System.out.println("Sayi 2: ");
                    b = scanner.nextInt();
                    System.out.println("Sayi 3: ");
                    c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Sonuc : " + cikarma(a,b,c));
                }else {
                   System.out.println("Bunun icin uygun parametre bulunmuyor...");
                }

            }else if(islem.equals("3")){
                System.out.println("Kac deger boleceksiniz? (2 veya 3)");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.println("Sayi 1: ");
                    a = scanner.nextInt();
                    System.out.println("Sayi 2: ");
                    b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Sonuc : " + bolme(a, b));
                } else if (kacsayi == 3) {
                    System.out.println("Sayi 1: ");
                    a = scanner.nextInt();
                    System.out.println("Sayi 2: ");
                    b = scanner.nextInt();
                    System.out.println("Sayi 3: ");
                    c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Sonuc : " + bolme(a,b,c));
                }else {
                   System.out.println("Bunun icin uygun parametre bulunmuyor...");
                }
            }else if(islem.equals("4")){
                System.out.println("Kac deger carpacaksiniz? (2 veya 3)");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.println("Sayi 1: ");
                    a = scanner.nextInt();
                    System.out.println("Sayi 2: ");
                    b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sonuc : " + carpma(a, b));
                } else if (kacsayi == 3) {
                    System.out.println("Sayi 1: ");
                    a = scanner.nextInt();
                    System.out.println("Sayi 2: ");
                    b = scanner.nextInt();
                    System.out.println("Sayi 3: ");
                    c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Sonuc : " + carpma(a,b,c));
                }else {
                   System.out.println("Bunun icin uygun parametre bulunmuyor...");
                }
            }else{
                System.out.println("Bunun icin uygun parametre bulunmuyor...");
            }
        }

    }

}
