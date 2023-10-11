
package com.mycompany.javaatm3;

import java.util.Scanner;

public class Login {
    
       public boolean login(Account account) {

        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.println("Kullanıcı Adı: ");
        kullanici_adi = scanner.nextLine();
        
        System.out.println("Parola: ");
        parola = scanner.nextLine();
        
        if((account.getKullanici_adi().equals(kullanici_adi)) && (account.getParola().equals(parola)))
        {
            return true;

        } else {
            return false;
        }
    }

    
}
