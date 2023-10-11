package com.mycompany.javaatm3;

import java.util.Scanner;

public class ATM {
    
    public void calis(Account account) {
        
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz.....");
        System.out.println("***********************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("***********************************");
        
        int giris_hakki = 3;
        
        while (true) {
            if (login.login(account)) {
                System.out.println("Giriş Başarılı");
                break;
            } else {
                System.out.println("Giriş Başarısız");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
            }
            
            if (giris_hakki == 0) {
                System.out.println("Giriş Hakkınız Bitti");
                return;
            }
        }
        
        System.out.println("*****************************");
        
        String islemler = "1. Bakiye Görüntüle "
                + "2. Para Yatır "
                + "3. Para Çek "
                + "Çıkmak için q";
        
        System.out.println(islemler);
        System.out.println("*****************************");
        
        while (true) {
            System.out.println("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.println(account.getBakiye());
                
            } else if (islem.equals("2")) {
                System.out.println("Yatırılacak Tutarı Giriniz.");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("Çekilece Tutarı Giriniz.");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.paraCek(tutar);
            }else{
                System.out.println("Yanlış Parametre Girdiniz...");
            }
            
        }
    }
    
}
